// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package MyXDR;

import java.io.IOException;

import static MyXDR.Constants.*;
import java.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

// === xdr source ============================================================

//  enum Color {
//      RED=0,  
//      GREEN=1,  
//      BLUE=2  
//  };

//  ===========================================================================
public enum Color implements XdrElement {
  RED(0),
  GREEN(1),
  BLUE(2),
  ;
  private int mValue;

  Color(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  public static Color decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return RED;
      case 1: return GREEN;
      case 2: return BLUE;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, Color value) throws IOException {
    stream.writeInt(value.getValue());
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
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

  public static Color fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64.getDecoder().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static Color fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
