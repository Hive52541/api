package collection;

import java.util.HashSet;

public class HashSetApp2 {

  public static void main(String[] args) {
    HashSet<User> set = new HashSet<>();

    set.add(new User("kim", "김유신"));
    set.add(new User("kang", "강감찬"));
    set.add(new User("lee", "이순신"));
    set.add(new User("ryu", "류관순"));
    set.add(new User("ahn", "안중근"));
    set.add(new User("hong", "홍길동"));
    set.add(new User("hong", "홍길동"));
    set.add(new User("hong", "홍길동"));

    for (User user : set) {
      System.out.println(user.id + ", " + user.name);
    }
  }

  static class User {

    String id;
    String name;

    public User(String id, String name) {
      this.id = id;
      this.name = name;
    }

    /*
     * hashCode()와 equals() 메소드를 재정의 해서 id값이 같은 User 객체는 같은 객체로 판단하도록 하였음.
     */
    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (getClass() != obj.getClass()) return false;
      User other = (User) obj;
      if (id == null) {
        if (other.id != null) return false;
      } else if (!id.equals(other.id)) return false;
      return true;
    }
  }
}
