package programmerzamannow.datetime;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class DateTest {
    
    @Test
    void create(){
        var date1 = new Date();
        var date2 = new Date(System.currentTimeMillis());
        var date3 = new Date(1045155600000L);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }

    @Test
    void testGetCalendar(){
        Calendar calendar = Calendar.getInstance();

        System.out.println("tahun : " + calendar.get(Calendar.YEAR));
        System.out.println("bulan : " + calendar.get(Calendar.MONTH));
        System.out.println("hari dalam tahun : " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("hari dalam bulan : " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("hari dalam minggu : " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("jam dalam hari : " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("menit : " + calendar.get(Calendar.MINUTE));
        System.out.println("detik : " + calendar.get(Calendar.SECOND));
        System.out.println("milisecond : " + calendar.get(Calendar.MILLISECOND));
    }

    @Test
    void testModifyCalendar(){
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2003);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 14);
        calendar.set(Calendar.HOUR_OF_DAY, 04);
        calendar.set(Calendar.MINUTE, 10);
        calendar.set(Calendar.SECOND, 30);

        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(date.getTime()); //get milisecond
    }
}







