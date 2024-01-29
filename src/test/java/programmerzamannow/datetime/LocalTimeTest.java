package programmerzamannow.datetime;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class LocalTimeTest {
    
    @Test
    void create(){
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(10,10,10);
        LocalTime localTime3 = LocalTime.parse("10:10");

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void change() {
  
      LocalTime localTime1 = LocalTime.now();
      LocalTime localTime2 = localTime1.withHour(11);
      LocalTime localTime3 = localTime1.withHour(5).withMinute(10).withSecond(0);
  
      System.out.println(localTime1);
      System.out.println(localTime2);
      System.out.println(localTime3);
  
    }
  
    @Test
    void modify() {
  
      LocalTime localTime1 = LocalTime.now();
      LocalTime localTime2 = localTime1.plusHours(10);
      LocalTime localTime3 = localTime1.plusHours(5).minusMinutes(10).minusSeconds(5);
  
      System.out.println(localTime1);
      System.out.println(localTime2);
      System.out.println(localTime3);
  
    }
  
    @Test
    void get() {
      LocalTime localTime = LocalTime.now();
  
      System.out.println(localTime.getHour());
      System.out.println(localTime.getMinute());
      System.out.println(localTime.getSecond());
      System.out.println(localTime.getNano());
    }
}
