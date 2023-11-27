package generic;

public class GenericBox<T> {

  private T value;

  public void add(T newValue) {
    value = newValue;
  }

  public T get() {
    return value;
  }
}
