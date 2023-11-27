package generic;

public class App3 {

  public static void main(String[] args) {
    Fruitbox<Apple> box1 = new Fruitbox<>();
    box1.add(new Apple());
    Apple apple = box1.get();

    Fruitbox<Banana> box2 = new Fruitbox<Banana>();
    box2.add(new Banana());
    //FruitBox 는 Fruit 종류만 타입 파라미터로 지정할 수 있다.

    // Fruitbox<String> box2 = new Fruitbox<String>();
    // box2.add("홍길동");
    // String value1 = box2.get();
  }
}
