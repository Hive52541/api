package wrapper;

public class WrapperApp3 {

  public static void main(String[] args) {
    /*
     * 문자열을 숫자(정수, 실수)로 변환하기
     * -Wrapper 클래스의 정적 메소드를 활용하면 문자열을 숫자로 변환할수 있다.
     * int Integer.parseInt(String str)
     * long Long.parseLong(String str)
     * double Double.parseDouble(String str)
     *
     * Integer   Integer.valueOf(String str)
     * Long     Long.valueOf(String str)
     * Double    Double.valueOf(String str)
     *
     * 숫자를 문자열로 변환하기
     * -String 클래스 정적 메소드를 활용하면 문자열로 변환할수 있다.
     *
     *  String String.valueOf(int value)
     *  String String.valueOf(long value)
     *  String String.valueOf(double value)
     *
     *
     */

    int a = Integer.parseInt("123");
    long b = Long.parseLong("1000000000");
    double c = Double.parseDouble("3.141592");

    //int d = Integer.parseInt("1234 "); 오류 발생  NumberFormatException 예외 발생. 공백, 가나다라 같은 한글 (1234가) 들어가 있기 때문.

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    // System.out.println(d);

    Integer d = Integer.valueOf("1000");
    int e = Integer.valueOf("10000");

    Object x = 10;
    /*
     *  Object x = 10;
     *
     *  x가 Object 타입의 참조변수가 때문에 Integer 객체가 생성됨-오토박싱
     *      =new Integer(10);
     *
     * x가 Object 타입이기 때문에 Integer객체의 주소값이 아니라
     *                           Integer객체의 Object 객체 주소값이 x에 대입된다.- 클래스 형변환
     *  Object x = new Integer(10);
     *
     */
  }
}
