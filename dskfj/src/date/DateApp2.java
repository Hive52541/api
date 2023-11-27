package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApp2 {

  public static void main(String[] args) {
    /*
     * 날짜와 시간정보를 지정된 포맷형식의 텍스트로 변환하기
     *
     * SimpleDateFormat
     * -Date객체의 날짜와 시간정보를 지정된 포맷의 텍스트로 변환한다.
     * -주요 메소드
     *  생성자
     *      SimpleDateFormat(String pattern)
     *      -지정된 패턴으로 날짜와 텍스트간의 변환을 지원하는 객체를 생성한다.
     *      String format(Date date)
     *      -Date객체의 날짜와 시간정보를 생성자에서 지정한 패턴에 맞는 포맷형식의 텍스트로 변환해서 반환한다.
     *      Date parse(String text)
     *      -텍스트가 생성자에서 지정한 형식으로 작성된 날짜와 시간정보라면
     *      텍스트에 해당하는 날짜와 시간정보를 가진 Date객체로 변환해서 반환한다.
     *
     *
     */
    Date now = new Date();

    String pattern1 = "yyyy-MM-dd";
    SimpleDateFormat sdf = new SimpleDateFormat(pattern1);
    String text = sdf.format(now);

    System.out.println(text); //2023-11-15  *2023-11-01

    sdf.applyPattern("yyyy-M-d");
    String text2 = sdf.format(now);
    System.out.println(text2); //2023-11-15    *2023-11-1

    sdf.applyPattern("yyyy년 M월 d일");
    String text3 = sdf.format(now);
    System.out.println(text3); //2023년 11월 15일

    sdf.applyPattern("M월 d일 E");
    String text4 = sdf.format(now);
    System.out.println(text4); //11월 15일 수

    sdf.applyPattern("M월 d일 EEEE");
    String text5 = sdf.format(now);
    System.out.println(text5); //11월 15일 수요일  *EEEE 는 요일이 붙는다

    sdf.applyPattern("HH:mm:ss");
    String text6 = sdf.format(now);
    System.out.println(text6); //15:27:56  *HH는 24시간 표기

    sdf.applyPattern("hh:mm:ss");
    String text7 = sdf.format(now);
    System.out.println(text7); //03:28:54    *hh는 12시간 표기

    sdf.applyPattern("a h시 m분 s초");
    String text8 = sdf.format(now);
    System.out.println(text8); //오후 3시 30분 30초   *a 는 오전/오후 자동으로 표기

    sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
    String text9 = sdf.format(now);
    System.out.println(text9); //2023-11-15 15:33:26


    //날짜와 텍스트 관련 변환을 지원하는 DateUtils 클래스를 사용하기
    String text = DateUtils.dateToString(now);
    System.out.println(text);

    String textDetail = DateUtils.dateToDetailString(now);
    System.out.println(textDetail);
  }
}
