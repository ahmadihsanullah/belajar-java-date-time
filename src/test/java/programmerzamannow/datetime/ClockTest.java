package programmerzamannow.datetime;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

import org.junit.jupiter.api.Test;

public class ClockTest {
    
    @Test
    void create(){

        Clock clock = Clock.systemUTC();
        System.out.println(clock);

        Clock clock2 = Clock.systemDefaultZone();
        System.out.println(clock2);

        Clock clock3 = Clock.system(ZoneId.of("Asia/Jakarta"));
        System.out.println(clock3);
    }

    @Test
    void instant() throws InterruptedException{
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        Instant instant1 = clock.instant();
        System.out.println(instant1);

        Thread.sleep(1000);

        Instant instant2 = clock.instant();
        System.out.println(instant2);
    }
}
