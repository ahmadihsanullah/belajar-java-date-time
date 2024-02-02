package programmerzamannow.datetime;

import java.time.DayOfWeek;

import org.junit.jupiter.api.Test;

public class DayofWeekTest {

    @Test
    void create() {
        DayOfWeek dayOfWeek1 = DayOfWeek.FRIDAY;
        DayOfWeek dayOfWeek2 = dayOfWeek1.plus(2);
        DayOfWeek dayOfWeek3 = dayOfWeek1.plus(7);

        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek2);
        System.out.println(dayOfWeek3);

    }
    
}
