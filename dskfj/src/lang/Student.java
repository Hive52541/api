package lang;

public class Student implements Comparable<Student> {

  int no;
  String name;

  public Student(int no, String name) {
    this.no = no;
    this.name = name;
  }

  public String toString() {
    return "{no:" + no + ", name:" + name + "}";
  }

  @Override
  public int compareTo(Student other) {
    //return this.no - other.no; 숫자순
    return this.name.compareTo(other.name); //이름순
  }
}
/*
 * this ===> no = 10, name ="홍길동"
 * other ===> no = 3, name ="강감찬"
 *
 * 양의 정수 -this의 순위가 뒤다.
 * 음의 정수 -this의 순위가 앞이다.
 * 0        -둘다 같다.
 *          -this와 other의 순위가 동일하다.
 */
