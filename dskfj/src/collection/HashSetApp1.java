package collection;

import java.util.HashSet;
import java.util.stream.Stream;

public class HashSetApp1 {

  public static void main(String[] args) {
    /*

        HashSet<E>
       
        * -Set<E> 인터페이스를 구현한 자료구조 구현클래스다
        중족된 객체의 저장을 허용하지 않는 자료구조 구현 클래스다.
        -객체의 동일성을 비교를 구현하기 위해서 equals(), hashcode() 메소드를 재정의 할 필요가 있다(HashSet<E>)에 저장되는 객체가 구현해야 함.
        String, Wrapper 클래스는 equals()와 hashCode()가 이미 재정의되어있다. 
   
        */

    //String 객체를 저장하는 HashSet 객체 생성하기

    HashSet<String> set = new HashSet<String>();

    //boolean add(E e) 메소드를 사용해서 HashSet 객체에 String 객체 사용하기
    set.add("홍길동");
    set.add("김유신");
    set.add("강감찬");
    set.add("이순신");
    set.add("류관순");
    set.add("안중근");
    set.add("안중근"); //중복, 저장되지 않음
    set.add("안중근");
    set.add("안중근");
    set.add("안중근");

    //int size() 메소드를 사용해서 HashSet 객체에 저장된 객체의 갯수 조회하기
    int size = set.size();
    System.out.println("저장된 객체의 갯수: " + size);

    //향상된 for문을 사용해서 HashSet 객체에 저장된 객체들을 하나씩 처리하기
    for (String name : set) {
      System.out.println(name);
      // Stram<String>
      // Stream Foreach = String name>>System.out.println(name);

      // System.out.println("### Stream을 활용해서 HashSet 객체에 저장된 객체 처리");
      // Stream

    }

    boolean isExist = set.contains("강감찬");
    System.out.println("존재여부: " + isExist);

    boolean isEmpty = set.isEmpty();
    System.out.println("비어있는가?: " + isEmpty);

    set.clear();

    System.out.println("비어있는가?: " + set.isEmpty());
  }
}
