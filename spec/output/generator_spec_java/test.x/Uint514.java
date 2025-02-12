// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package MyXDR;

import java.io.IOException;

import static MyXDR.Constants.*;
import java.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

// === xdr source ============================================================

//  typedef opaque uint514<>;

//  ===========================================================================
public class Uint514 implements XdrElement {
  private byte[] uint514;

  public Uint514() {}

  public Uint514(byte[] uint514) {
    this.uint514 = uint514;
  }

  public byte[] getUint514() {
    return this.uint514;
  }

  public void setUint514(byte[] value) {
    this.uint514 = value;
  }

  public static void encode(XdrDataOutputStream stream, Uint514  encodedUint514) throws IOException {
    int uint514size = encodedUint514.uint514.length;
    stream.writeInt(uint514size);
    stream.write(encodedUint514.getUint514(), 0, uint514size);
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static Uint514 decode(XdrDataInputStream stream) throws IOException {
    Uint514 decodedUint514 = new Uint514();
    int uint514size = stream.readInt();
    decodedUint514.uint514 = new byte[uint514size];
    stream.read(decodedUint514.uint514, 0, uint514size);
    return decodedUint514;
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(this.uint514);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Uint514)) {
      return false;
    }

    Uint514 other = (Uint514) object;
    return Arrays.equals(this.uint514, other.uint514);
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

  public static Uint514 fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64.getDecoder().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static Uint514 fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
