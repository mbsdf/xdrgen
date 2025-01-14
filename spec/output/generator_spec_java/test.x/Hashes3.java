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

//  typedef Hash Hashes3<>;

//  ===========================================================================
public class Hashes3 implements XdrElement {
  private Hash[] Hashes3;

  public Hashes3() {}

  public Hashes3(Hash[] Hashes3) {
    this.Hashes3 = Hashes3;
  }

  public Hash[] getHashes3() {
    return this.Hashes3;
  }

  public void setHashes3(Hash[] value) {
    this.Hashes3 = value;
  }

  public static void encode(XdrDataOutputStream stream, Hashes3  encodedHashes3) throws IOException {
    int Hashes3size = encodedHashes3.getHashes3().length;
    stream.writeInt(Hashes3size);
    for (int i = 0; i < Hashes3size; i++) {
      Hash.encode(stream, encodedHashes3.Hashes3[i]);
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static Hashes3 decode(XdrDataInputStream stream) throws IOException {
    Hashes3 decodedHashes3 = new Hashes3();
    int Hashes3size = stream.readInt();
    decodedHashes3.Hashes3 = new Hash[Hashes3size];
    for (int i = 0; i < Hashes3size; i++) {
      decodedHashes3.Hashes3[i] = Hash.decode(stream);
    }
    return decodedHashes3;
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(this.Hashes3);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Hashes3)) {
      return false;
    }

    Hashes3 other = (Hashes3) object;
    return Arrays.equals(this.Hashes3, other.Hashes3);
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

  public static Hashes3 fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64.getDecoder().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static Hashes3 fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
