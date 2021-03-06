/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package balaena.common.serde.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FlumeEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FlumeEvent\",\"namespace\":\"balaena.common.serde.avro\",\"fields\":[{\"name\":\"headers\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"body\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> headers;
  @Deprecated public java.lang.CharSequence body;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public FlumeEvent() {}

  /**
   * All-args constructor.
   */
  public FlumeEvent(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> headers, java.lang.CharSequence body) {
    this.headers = headers;
    this.body = body;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return headers;
    case 1: return body;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: headers = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 1: body = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'headers' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getHeaders() {
    return headers;
  }

  /**
   * Sets the value of the 'headers' field.
   * @param value the value to set.
   */
  public void setHeaders(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.headers = value;
  }

  /**
   * Gets the value of the 'body' field.
   */
  public java.lang.CharSequence getBody() {
    return body;
  }

  /**
   * Sets the value of the 'body' field.
   * @param value the value to set.
   */
  public void setBody(java.lang.CharSequence value) {
    this.body = value;
  }

  /** Creates a new FlumeEvent RecordBuilder */
  public static balaena.common.serde.avro.FlumeEvent.Builder newBuilder() {
    return new balaena.common.serde.avro.FlumeEvent.Builder();
  }
  
  /** Creates a new FlumeEvent RecordBuilder by copying an existing Builder */
  public static balaena.common.serde.avro.FlumeEvent.Builder newBuilder(balaena.common.serde.avro.FlumeEvent.Builder other) {
    return new balaena.common.serde.avro.FlumeEvent.Builder(other);
  }
  
  /** Creates a new FlumeEvent RecordBuilder by copying an existing FlumeEvent instance */
  public static balaena.common.serde.avro.FlumeEvent.Builder newBuilder(balaena.common.serde.avro.FlumeEvent other) {
    return new balaena.common.serde.avro.FlumeEvent.Builder(other);
  }
  
  /**
   * RecordBuilder for FlumeEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FlumeEvent>
    implements org.apache.avro.data.RecordBuilder<FlumeEvent> {

    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> headers;
    private java.lang.CharSequence body;

    /** Creates a new Builder */
    private Builder() {
      super(balaena.common.serde.avro.FlumeEvent.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(balaena.common.serde.avro.FlumeEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.headers)) {
        this.headers = data().deepCopy(fields()[0].schema(), other.headers);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.body)) {
        this.body = data().deepCopy(fields()[1].schema(), other.body);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing FlumeEvent instance */
    private Builder(balaena.common.serde.avro.FlumeEvent other) {
            super(balaena.common.serde.avro.FlumeEvent.SCHEMA$);
      if (isValidValue(fields()[0], other.headers)) {
        this.headers = data().deepCopy(fields()[0].schema(), other.headers);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.body)) {
        this.body = data().deepCopy(fields()[1].schema(), other.body);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'headers' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getHeaders() {
      return headers;
    }
    
    /** Sets the value of the 'headers' field */
    public balaena.common.serde.avro.FlumeEvent.Builder setHeaders(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[0], value);
      this.headers = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'headers' field has been set */
    public boolean hasHeaders() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'headers' field */
    public balaena.common.serde.avro.FlumeEvent.Builder clearHeaders() {
      headers = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'body' field */
    public java.lang.CharSequence getBody() {
      return body;
    }
    
    /** Sets the value of the 'body' field */
    public balaena.common.serde.avro.FlumeEvent.Builder setBody(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.body = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'body' field has been set */
    public boolean hasBody() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'body' field */
    public balaena.common.serde.avro.FlumeEvent.Builder clearBody() {
      body = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public FlumeEvent build() {
      try {
        FlumeEvent record = new FlumeEvent();
        record.headers = fieldSetFlags()[0] ? this.headers : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[0]);
        record.body = fieldSetFlags()[1] ? this.body : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
