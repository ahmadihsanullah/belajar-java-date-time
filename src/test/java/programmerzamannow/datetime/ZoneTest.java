package programmerzamannow.datetime;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ZoneTest {
    
    @Test
    void createZoneId(){
        ZoneId zoneId1 = ZoneId.systemDefault();
        System.out.println(zoneId1);

        ZoneId zoneGMT = ZoneId.of("GMT");
        System.out.println(zoneGMT);

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        zoneIds.forEach(System.out::println);
    }

    @Test
    void createZoneOffset() {
        ZoneOffset zoneOffset1 = ZoneOffset.of("+07:00");
        ZoneOffset zoneOffset2 = ZoneOffset.ofHours(-7);
        ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(7, 30);

        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
        System.out.println(zoneOffset3);
    }
}
