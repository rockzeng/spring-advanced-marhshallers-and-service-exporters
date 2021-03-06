/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.springframework.obm.messagepack.util;

import org.msgpack.MessagePackObject;
import org.springframework.core.GenericCollectionTypeResolver;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Josh Long
 */
@SuppressWarnings("unchecked")
public abstract class MessagePackUtils {

    private static <T> Collection<T> buildReplacementCollection(Collection<T> in) throws Throwable {

        int size = in.size();
        if (in.getClass().isInterface()) {

            if (in.getClass().equals(Set.class)) {
                return new HashSet<T>(size);
            }
            if (in.getClass().equals(List.class)) {
                return new ArrayList<T>(size);
            }
            if (in.getClass().equals(Queue.class)) {
                return new ArrayBlockingQueue<T>(size);
            }
        } else {
            return in.getClass().newInstance();
        }
        throw new RuntimeException("we couldn't figure out a replacement collection for the input collection type, " + in.getClass().getName());
    }

    private static Object convertMessagePackObject(Object input, Class<?> clzz) {
        if (input instanceof MessagePackObject) {
            MessagePackObject messagePackObject = (MessagePackObject) input;
            return messagePackObject.convert(clzz);
        }
        return null;
    }


    public static <T> T remapResult(final T result) throws Throwable {
        Class<?> clazzOfT = result.getClass();

        if (ReflectionUtils.isUninterestingClass(clazzOfT)) {
            return result;
        }

        org.springframework.util.ReflectionUtils.doWithFields(result.getClass(), new org.springframework.util.ReflectionUtils.FieldCallback() {
            @Override
            public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
                try {

                    if (org.springframework.util.ReflectionUtils.isPublicStaticFinal(field) || Modifier.isFinal(field.getModifiers())) {
                        return;
                    }

                    if (!field.isAccessible()) {
                        field.setAccessible(true);
                    }

                    Object value = field.get(result);

                    if (Collection.class.isAssignableFrom(value.getClass())) {

                        Collection<?> values = (Collection<?>) value;
                        Collection destination = buildReplacementCollection(values);
                        Class<?> classOfCollection = GenericCollectionTypeResolver.getCollectionFieldType(field);
                        for (Object srcObject : values) {
                            if (srcObject instanceof MessagePackObject) {
                                destination.add(convertMessagePackObject(srcObject, classOfCollection));
                            } else {
                                destination.add(srcObject);
                            }
                        }
                        // set the new value in place
                        field.set(result, destination);
                    }
                } catch (Throwable thr) {
                    throw new RuntimeException(thr);
                }
            }
        });

        return result;
    }


}
