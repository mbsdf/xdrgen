// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package MyXDR;

import java.io.IOException;

import static MyXDR.Constants.*;
import java.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

// === xdr source ============================================================

//  struct MyStruct
//  {
//      uint512 field1;
//      optHash1 field2;
//      int1 field3;
//      unsigned int field4;
//      float field5;
//      double field6;
//      bool field7;
//  };

//  ===========================================================================
public class MyStruct implements XdrElement {
  public MyStruct () {}
  private Uint512 field1;
  public Uint512 getField1() {
    return this.field1;
  }
  public void setField1(Uint512 value) {
    this.field1 = value;
  }
  private OptHash1 field2;
  public OptHash1 getField2() {
    return this.field2;
  }
  public void setField2(OptHash1 value) {
    this.field2 = value;
  }
  private Int1 field3;
  public Int1 getField3() {
    return this.field3;
  }
  public void setField3(Int1 value) {
    this.field3 = value;
  }
  private XdrUnsignedInteger field4;
  public XdrUnsignedInteger getField4() {
    return this.field4;
  }
  public void setField4(XdrUnsignedInteger value) {
    this.field4 = value;
  }
  private Float field5;
  public Float getField5() {
    return this.field5;
  }
  public void setField5(Float value) {
    this.field5 = value;
  }
  private Double field6;
  public Double getField6() {
    return this.field6;
  }
  public void setField6(Double value) {
    this.field6 = value;
  }
  private Boolean field7;
  public Boolean getField7() {
    return this.field7;
  }
  public void setField7(Boolean value) {
    this.field7 = value;
  }
  public static void encode(XdrDataOutputStream stream, MyStruct encodedMyStruct) throws IOException{
    Uint512.encode(stream, encodedMyStruct.field1);
    OptHash1.encode(stream, encodedMyStruct.field2);
    Int1.encode(stream, encodedMyStruct.field3);
    encodedMyStruct.field4.encode(stream);
    stream.writeFloat(encodedMyStruct.field5);
    stream.writeDouble(encodedMyStruct.field6);
    stream.writeInt(encodedMyStruct.field7 ? 1 : 0);
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static MyStruct decode(XdrDataInputStream stream) throws IOException {
    MyStruct decodedMyStruct = new MyStruct();
    decodedMyStruct.field1 = Uint512.decode(stream);
    decodedMyStruct.field2 = OptHash1.decode(stream);
    decodedMyStruct.field3 = Int1.decode(stream);
    decodedMyStruct.field4 = XdrUnsignedInteger.decode(stream);
    decodedMyStruct.field5 = stream.readFloat();
    decodedMyStruct.field6 = stream.readDouble();
    decodedMyStruct.field7 = stream.readInt() == 1 ? true : false;
    return decodedMyStruct;
  }
  @Override
  public int hashCode() {
    return Objects.hash(this.field1, this.field2, this.field3, this.field4, this.field5, this.field6, this.field7);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof MyStruct)) {
      return false;
    }

    MyStruct other = (MyStruct) object;
    return Objects.equals(this.field1, other.field1) && Objects.equals(this.field2, other.field2) && Objects.equals(this.field3, other.field3) && Objects.equals(this.field4, other.field4) && Objects.equals(this.field5, other.field5) && Objects.equals(this.field6, other.field6) && Objects.equals(this.field7, other.field7);
  }

  @Override
  public String toXdrBase64() throws IOException {
    return Base64.getEncoder().encodeToString(toXdrByteArray());
  }

  @Override
  public byte[] toXdrByteArray() throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    XdrDataOutputStream xdrDataOutputStream = new XdrDataOutputStream(byteArrayOutputStream);
    encode(xdrDataOutputStream);
    return byteArrayOutputStream.toByteArray();
  }

  public static MyStruct fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64.getDecoder().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static MyStruct fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
  public static final class Builder {
    private Uint512 field1;
    private OptHash1 field2;
    private Int1 field3;
    private XdrUnsignedInteger field4;
    private Float field5;
    private Double field6;
    private Boolean field7;

    public Builder field1(Uint512 field1) {
      this.field1 = field1;
      return this;
    }

    public Builder field2(OptHash1 field2) {
      this.field2 = field2;
      return this;
    }

    public Builder field3(Int1 field3) {
      this.field3 = field3;
      return this;
    }

    public Builder field4(XdrUnsignedInteger field4) {
      this.field4 = field4;
      return this;
    }

    public Builder field5(Float field5) {
      this.field5 = field5;
      return this;
    }

    public Builder field6(Double field6) {
      this.field6 = field6;
      return this;
    }

    public Builder field7(Boolean field7) {
      this.field7 = field7;
      return this;
    }

    public MyStruct build() {
      MyStruct val = new MyStruct();
      val.setField1(this.field1);
      val.setField2(this.field2);
      val.setField3(this.field3);
      val.setField4(this.field4);
      val.setField5(this.field5);
      val.setField6(this.field6);
      val.setField7(this.field7);
      return val;
    }
  }
}
