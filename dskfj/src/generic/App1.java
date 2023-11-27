package generic;

import java.util.Date;

public class App1 {

  public static void main(String[] args) {
    NoneGenericBox box1 = new NoneGenericBox();
    box1.add(100);
    NoneGenericBox box2 = new NoneGenericBox();
    box2.add("홍길동");
    NoneGenericBox box3 = new NoneGenericBox();
    box3.add(new Date());

  }
}
