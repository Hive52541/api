package date;

import java.util.Date;

public class DateApp1 {

  public static void main(String[] args) {
    /*
     * 자바의 날짜/시간 API
     * java.util.Date
     *  -날짜, 시간, 시간대 정보를 제공한다.
     * java.util.Calender
     * -날짜,시간, 날짜 조작과 관련된 다양한 메소드를 제공한다
     * -날짜에 대한 더 다양한 정보를 제공한다.
     * java.text.SimpledateFormat
     *  -날짜 <--->텍스트변환을 지원한다.
     */

    //시스템의 현재 날짜와 시간정보를 가진 Date 객체를 생성한다.
    Date now = new Date();

    System.out.println(now);

    long unixTime = now.getTime();
    System.out.println("유닉스 타임: " + unixTime);
    
    //영국기준 1970년 1월 1일 0시 0분 0초에 해당하는 날짜와 시간정보를
    // Date date1 = new Date(0);
    // System.out.println(date1);
  }
}
