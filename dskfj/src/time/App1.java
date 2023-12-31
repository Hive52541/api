package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App1 {

  public static void main(String[] args) {
    //현재 날짜 정보를 가진 LocalDate객체 생성하기
    LocalDate date1 = LocalDate.now();
    System.out.println("현재날짜: " + date1);

    //현재 시간 정보를 가진 LocalTime객체 생성하기
    LocalTime datetime1 = LocalTime.now();
    System.out.println("현재 시간: " + datetime1);

    //지정된 날짜 정보를 가진 LocalDate객체 생성하기
    LocalDate date2 = LocalDate.of(2023, 11, 1);
    System.out.println("지정된 날짜: " + date2);

    //지정된 날짜, 시간 정보를 가진 LocalDateTime 객체 생성하기
    LocalDateTime dateTime2 = LocalDateTime.of(2023, 10, 31, 10, 5, 48);
    System.out.println("지정된 날짜: " + dateTime2);
  }
}
