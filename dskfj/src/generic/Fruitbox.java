package generic;

/*
 * <T extends 타입>으로 타입파라미터의 타입을 제한할수있다.
 */

public class Fruitbox<T extends Fruit> {

  T fruit;

  public void add(T t) {
    this.fruit = t;
  }

  public T get() {
    return fruit;
  }
}
