package lang;

//import javax.management.RuntimeErrorException;

import java.util.Objects;

public class Contact implements Cloneable{

  String name;
  String phone;
  String email;
  String company;

  /**
   * 이 객체의 복사본을 반환한다.
   * @return 복제된 Contact 객체
   */

  public Contact copy() {
    try {
      /*
       * Object의 clone()메소드
       * -protected Object clone(){...}
       * -clone() 메소드는 접근제한자가 protected이기 때문에 Object를 상속받은 Contact의 내부에서 사용할 수 있다.
       * -clone() 메소드는 해당 객체를 복제한 객체를 반환한다.
       * 단, 반환타입의 Object 타입이다
       * 단, Contact의 copy() 메소드에서 복제하는 객체는 언제나 Contact객체 일것이기 때문에 Contact 타입은 형변환이 가능하다.
       */
      Contact clonedContact = (Contact) clone();
      return clonedContact;
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((phone == null) ? 0 : phone.hashCode());
    return result;
    //return Objects.hash(name, phone);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Contact other = (Contact) obj;
    if (name == null) {
      if (other.name != null) return false;
    } else if (!name.equals(other.name)) return false;
    if (phone == null) {
      if (other.phone != null) return false;
    } else if (!phone.equals(other.phone)) return false;
    return true;
  }

  @Override
  public String toString() {
    return (
      "Contact [name=" +
      name +
      ", phone=" +
      phone +
      ", email=" +
      email +
      ", company=" +
      company +
      "]"
    );
  }
  //Object로부터 상속받은 toString() 재정의하기

}
