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

//  union MyUnion switch (UnionKey type)
//  {
//      case ONE:
//          struct {
//              int someInt;
//          } one;
//  
//      case TWO:
//          struct {
//              int someInt;
//              Foo foo;
//          } two;
//  
//      case OFFER:
//          void;
//  };

//  ===========================================================================
public class MyUnion implements XdrElement {
  public MyUnion () {}
  UnionKey type;
  public UnionKey getDiscriminant() {
    return this.type;
  }
  public void setDiscriminant(UnionKey value) {
    this.type = value;
  }
  private MyUnionOne one;
  public MyUnionOne getOne() {
    return this.one;
  }
  public void setOne(MyUnionOne value) {
    this.one = value;
  }
  private MyUnionTwo two;
  public MyUnionTwo getTwo() {
    return this.two;
  }
  public void setTwo(MyUnionTwo value) {
    this.two = value;
  }

  public static final class Builder {
    private UnionKey discriminant;
    private MyUnionOne one;
    private MyUnionTwo two;

    public Builder discriminant(UnionKey discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public Builder one(MyUnionOne one) {
      this.one = one;
      return this;
    }

    public Builder two(MyUnionTwo two) {
      this.two = two;
      return this;
    }

    public MyUnion build() {
      MyUnion val = new MyUnion();
      val.setDiscriminant(discriminant);
      val.setOne(this.one);
      val.setTwo(this.two);
      return val;
    }
  }

  public static void encode(XdrDataOutputStream stream, MyUnion encodedMyUnion) throws IOException {
  //Xdrgen::AST::Identifier
  //UnionKey
  stream.writeInt(encodedMyUnion.getDiscriminant().getValue());
  switch (encodedMyUnion.getDiscriminant()) {
  case ONE:
  MyUnionOne.encode(stream, encodedMyUnion.one);
  break;
  case TWO:
  MyUnionTwo.encode(stream, encodedMyUnion.two);
  break;
  case OFFER:
  break;
  }
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static MyUnion decode(XdrDataInputStream stream) throws IOException {
  MyUnion decodedMyUnion = new MyUnion();
  UnionKey discriminant = UnionKey.decode(stream);
  decodedMyUnion.setDiscriminant(discriminant);
  switch (decodedMyUnion.getDiscriminant()) {
  case ONE:
  decodedMyUnion.one = MyUnionOne.decode(stream);
  break;
  case TWO:
  decodedMyUnion.two = MyUnionTwo.decode(stream);
  break;
  case OFFER:
  break;
  }
    return decodedMyUnion;
  }
  @Override
  public int hashCode() {
    return Objects.hash(this.one, this.two, this.type);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof MyUnion)) {
      return false;
    }

    MyUnion other = (MyUnion) object;
    return Objects.equals(this.one, other.one) && Objects.equals(this.two, other.two) && Objects.equals(this.type, other.type);
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

  public static MyUnion fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64.getDecoder().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static MyUnion fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }

  public static class MyUnionOne implements XdrElement {
    public MyUnionOne () {}
    private Integer someInt;
    public Integer getSomeInt() {
      return this.someInt;
    }
    public void setSomeInt(Integer value) {
      this.someInt = value;
    }
    public static void encode(XdrDataOutputStream stream, MyUnionOne encodedMyUnionOne) throws IOException{
      stream.writeInt(encodedMyUnionOne.someInt);
    }
    public void encode(XdrDataOutputStream stream) throws IOException {
      encode(stream, this);
    }
    public static MyUnionOne decode(XdrDataInputStream stream) throws IOException {
      MyUnionOne decodedMyUnionOne = new MyUnionOne();
      decodedMyUnionOne.someInt = stream.readInt();
      return decodedMyUnionOne;
    }
    @Override
    public int hashCode() {
      return Objects.hash(this.someInt);
    }
    @Override
    public boolean equals(Object object) {
      if (!(object instanceof MyUnionOne)) {
        return false;
      }

      MyUnionOne other = (MyUnionOne) object;
      return Objects.equals(this.someInt, other.someInt);
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

    public static MyUnionOne fromXdrBase64(String xdr) throws IOException {
      byte[] bytes = Base64.getDecoder().decode(xdr);
      return fromXdrByteArray(bytes);
    }

    public static MyUnionOne fromXdrByteArray(byte[] xdr) throws IOException {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
      XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
      return decode(xdrDataInputStream);
    }
    public static final class Builder {
      private Integer someInt;

      public Builder someInt(Integer someInt) {
        this.someInt = someInt;
        return this;
      }

      public MyUnionOne build() {
        MyUnionOne val = new MyUnionOne();
        val.setSomeInt(this.someInt);
        return val;
      }
    }

  }
  public static class MyUnionTwo implements XdrElement {
    public MyUnionTwo () {}
    private Integer someInt;
    public Integer getSomeInt() {
      return this.someInt;
    }
    public void setSomeInt(Integer value) {
      this.someInt = value;
    }
    private Foo foo;
    public Foo getFoo() {
      return this.foo;
    }
    public void setFoo(Foo value) {
      this.foo = value;
    }
    public static void encode(XdrDataOutputStream stream, MyUnionTwo encodedMyUnionTwo) throws IOException{
      stream.writeInt(encodedMyUnionTwo.someInt);
      Foo.encode(stream, encodedMyUnionTwo.foo);
    }
    public void encode(XdrDataOutputStream stream) throws IOException {
      encode(stream, this);
    }
    public static MyUnionTwo decode(XdrDataInputStream stream) throws IOException {
      MyUnionTwo decodedMyUnionTwo = new MyUnionTwo();
      decodedMyUnionTwo.someInt = stream.readInt();
      decodedMyUnionTwo.foo = Foo.decode(stream);
      return decodedMyUnionTwo;
    }
    @Override
    public int hashCode() {
      return Objects.hash(this.someInt, this.foo);
    }
    @Override
    public boolean equals(Object object) {
      if (!(object instanceof MyUnionTwo)) {
        return false;
      }

      MyUnionTwo other = (MyUnionTwo) object;
      return Objects.equals(this.someInt, other.someInt) && Objects.equals(this.foo, other.foo);
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

    public static MyUnionTwo fromXdrBase64(String xdr) throws IOException {
      byte[] bytes = Base64.getDecoder().decode(xdr);
      return fromXdrByteArray(bytes);
    }

    public static MyUnionTwo fromXdrByteArray(byte[] xdr) throws IOException {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
      XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
      return decode(xdrDataInputStream);
    }
    public static final class Builder {
      private Integer someInt;
      private Foo foo;

      public Builder someInt(Integer someInt) {
        this.someInt = someInt;
        return this;
      }

      public Builder foo(Foo foo) {
        this.foo = foo;
        return this;
      }

      public MyUnionTwo build() {
        MyUnionTwo val = new MyUnionTwo();
        val.setSomeInt(this.someInt);
        val.setFoo(this.foo);
        return val;
      }
    }

  }
}
