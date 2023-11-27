package lang;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ContactApp4 {

  public static void main(String[] args) {
    Contact c1 = new Contact();

    /*
     *
     */

    Class<? extends Contact> clazz = c1.getClass();

    String value1 = clazz.getName();
    System.out.println(value1);

    Field[] fields = clazz.getDeclaredFields();
    for (Field f : fields) {
      System.out.println(f.getType().getName() + "\t" + f.getName());
    }

    Method[] methods = clazz.getDeclaredMethods();
    for (Method m : methods) {
      System.out.println(m.getReturnType().getName() + "\t" + m.getName());
    }
  }
}
