/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.springframework.obm.thrift.crm;

import java.util.*;

public class User implements org.apache.thrift.TBase<User, User._Fields>, java.io.Serializable, Cloneable {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("User");

    private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short) 1);
    private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short) 2);
    private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short) 3);

    public String email; // required
    public String password; // required
    public int id; // required

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        EMAIL((short) 1, "email"),
        PASSWORD((short) 2, "password"),
        ID((short) 3, "id");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // EMAIL
                    return EMAIL;
                case 2: // PASSWORD
                    return PASSWORD;
                case 3: // ID
                    return ID;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) {
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final int __ID_ISSET_ID = 0;
    private BitSet __isset_bit_vector = new BitSet(1);

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.REQUIRED,
                                                                                       new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.REQUIRED,
                                                                                          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT,
                                                                                    new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(User.class, metaDataMap);
    }

    public User() {
    }

    public User(
                       String email,
                       String password,
                       int id) {
        this();
        this.email = email;
        this.password = password;
        this.id = id;
        setIdIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public User(User other) {
        __isset_bit_vector.clear();
        __isset_bit_vector.or(other.__isset_bit_vector);
        if (other.isSetEmail()) {
            this.email = other.email;
        }
        if (other.isSetPassword()) {
            this.password = other.password;
        }
        this.id = other.id;
    }

    public User deepCopy() {
        return new User(this);
    }

    public void clear() {
        this.email = null;
        this.password = null;
        setIdIsSet(false);
        this.id = 0;
    }

    public String getEmail() {
        return this.email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public void unsetEmail() {
        this.email = null;
    }

    /**
     * Returns true if field email is set (has been assigned a value) and false otherwise
     */
    public boolean isSetEmail() {
        return this.email != null;
    }

    public void setEmailIsSet(boolean value) {
        if (!value) {
            this.email = null;
        }
    }

    public String getPassword() {
        return this.password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public void unsetPassword() {
        this.password = null;
    }

    /**
     * Returns true if field password is set (has been assigned a value) and false otherwise
     */
    public boolean isSetPassword() {
        return this.password != null;
    }

    public void setPasswordIsSet(boolean value) {
        if (!value) {
            this.password = null;
        }
    }

    public int getId() {
        return this.id;
    }

    public User setId(int id) {
        this.id = id;
        setIdIsSet(true);
        return this;
    }

    public void unsetId() {
        __isset_bit_vector.clear(__ID_ISSET_ID);
    }

    /**
     * Returns true if field id is set (has been assigned a value) and false otherwise
     */
    public boolean isSetId() {
        return __isset_bit_vector.get(__ID_ISSET_ID);
    }

    public void setIdIsSet(boolean value) {
        __isset_bit_vector.set(__ID_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case EMAIL:
                if (value == null) {
                    unsetEmail();
                } else {
                    setEmail((String) value);
                }
                break;

            case PASSWORD:
                if (value == null) {
                    unsetPassword();
                } else {
                    setPassword((String) value);
                }
                break;

            case ID:
                if (value == null) {
                    unsetId();
                } else {
                    setId((Integer) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case EMAIL:
                return getEmail();

            case PASSWORD:
                return getPassword();

            case ID:
                return Integer.valueOf(getId());

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case EMAIL:
                return isSetEmail();
            case PASSWORD:
                return isSetPassword();
            case ID:
                return isSetId();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (that instanceof User) {
            return this.equals((User) that);
        }
        return false;
    }

    public boolean equals(User that) {
        if (that == null) {
            return false;
        }

        boolean this_present_email = true && this.isSetEmail();
        boolean that_present_email = true && that.isSetEmail();
        if (this_present_email || that_present_email) {
            if (!(this_present_email && that_present_email)) {
                return false;
            }
            if (!this.email.equals(that.email)) {
                return false;
            }
        }

        boolean this_present_password = true && this.isSetPassword();
        boolean that_present_password = true && that.isSetPassword();
        if (this_present_password || that_present_password) {
            if (!(this_present_password && that_present_password)) {
                return false;
            }
            if (!this.password.equals(that.password)) {
                return false;
            }
        }

        boolean this_present_id = true;
        boolean that_present_id = true;
        if (this_present_id || that_present_id) {
            if (!(this_present_id && that_present_id)) {
                return false;
            }
            if (this.id != that.id) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public int compareTo(User other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;
        User typedOther = (User) other;

        lastComparison = Boolean.valueOf(isSetEmail()).compareTo(typedOther.isSetEmail());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetEmail()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, typedOther.email);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetPassword()).compareTo(typedOther.isSetPassword());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetPassword()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, typedOther.password);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField field;
        iprot.readStructBegin();
        while (true) {
            field = iprot.readFieldBegin();
            if (field.type == org.apache.thrift.protocol.TType.STOP) {
                break;
            }
            switch (field.id) {
                case 1: // EMAIL
                    if (field.type == org.apache.thrift.protocol.TType.STRING) {
                        this.email = iprot.readString();
                    } else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
                    }
                    break;
                case 2: // PASSWORD
                    if (field.type == org.apache.thrift.protocol.TType.STRING) {
                        this.password = iprot.readString();
                    } else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
                    }
                    break;
                case 3: // ID
                    if (field.type == org.apache.thrift.protocol.TType.I32) {
                        this.id = iprot.readI32();
                        setIdIsSet(true);
                    } else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
                    }
                    break;
                default:
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (this.email != null) {
            oprot.writeFieldBegin(EMAIL_FIELD_DESC);
            oprot.writeString(this.email);
            oprot.writeFieldEnd();
        }
        if (this.password != null) {
            oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
            oprot.writeString(this.password);
            oprot.writeFieldEnd();
        }
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(this.id);
        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User(");
        boolean first = true;

        sb.append("email:");
        if (this.email == null) {
            sb.append("null");
        } else {
            sb.append(this.email);
        }
        first = false;
        if (!first) {
            sb.append(", ");
        }
        sb.append("password:");
        if (this.password == null) {
            sb.append("null");
        } else {
            sb.append(this.password);
        }
        first = false;
        if (!first) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.id);
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        if (email == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'email' was not present! Struct: " + toString());
        }
        if (password == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'password' was not present! Struct: " + toString());
        }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te.getMessage());
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bit_vector = new BitSet(1);
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te.getMessage());
        }
    }

}

