package generic;

public class App2 {

  public static void main(String[] args) {
    /*
     * 제네릭이 적용된 Box클래스
     * -객체 생성싯점에 타입파라미터에 해당하는 객체의 타입을 지정할수 있다.
     * -객체 생성시 지정한 타입의 객체만 저장할수 있다.
     * -저장된 객체를 사용할 때 형변환이 필요없다.
     */
    GenericBox<String> box1 = new GenericBox<String>();
    box1.add("홍길동");
    // box2.add(100); //컴파일 과정에서 잘못된 값이 저장되는 것을 바로 확인할수 있다.
    box1.get();
    String value1 = box1.get();

    GenericBox<Integer> box2 = new GenericBox<>();
    box2.add(100); //box2.add(Integer.valueOf(100))
    int value2 = box2.get();
  }
}
