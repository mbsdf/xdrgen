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

//  typedef hyper int64;

//  ===========================================================================
public class Int64 implements XdrElement {
  private Long int64;

  public Int64() {}

  public Int64(Long int64) {
    this.int64 = int64;
  }

  public Long getInt64() {
    return this.int64;
  }

  public void setInt64(Long value) {
    this.int64 = value;
  }

  public static void encode(XdrDataOutputStream stream, Int64  encodedInt64) throws IOException {
    stream.writeLong(encodedInt64.int64);
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static Int64 decode(XdrDataInputStream stream) throws IOException {
    Int64 decodedInt64 = new Int64();
    decodedInt64.int64 = stream.readLong();
    return decodedInt64;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.int64);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Int64)) {
      return false;
    }

    Int64 other = (Int64) object;
    return Objects.equals(this.int64, other.int64);
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

  public static Int64 fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64.getDecoder().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static Int64 fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
