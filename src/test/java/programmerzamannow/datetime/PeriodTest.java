package programmerzamannow.datetime;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.Test;

public class PeriodTest {
    
    @Test
    void create(){
        Period period1 = Period.ofYears(2023);
        Period period2 = Period.ofMonths(4);
        Period period3 = Period.ofDays(12);
        Period period4 = Period.ofWeeks(3);
        Period period5 = Period.of(10,10,10);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
    }

    @Test
    void get() {

        Period period = Period.of(10, 10, 10);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }

     @Test
    void between() {

        Period period = Period.between(
            LocalDate.of(2003, 02, 14),
            LocalDate.now()
        );

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}
