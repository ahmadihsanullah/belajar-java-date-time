package programmerzamannow.datetime;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class CalenderTest {
    
    @Test
    void create(){
        Calendar calendar = Calendar.getInstance();
        
        Date date = calendar.getTime();
        System.out.println(date);
    }

    @Test
    void testModifyCalendar(){
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2003);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 14);
        calendar.set(Calendar.HOUR_OF_DAY, 4);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 40);
        calendar.set(Calendar.MILLISECOND, 100);
        
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println("MILISECOND : " +  date.getTime());
    }
}
