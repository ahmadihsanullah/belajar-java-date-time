package programmerzamannow.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TemporalInterfaceTest {
    
    @Test
    void temporal() {

        Temporal temporal1 = LocalDate.now();
        Temporal temporal2 = LocalTime.now();
        Temporal temporal3 = ZonedDateTime.now();
        Temporal temporal4 = Year.now();

    }

    @Test
    void temporalAmount() {

        Temporal temporal1 = LocalDateTime.now();
        Temporal temporal2 = temporal1.plus(Duration.ofHours(10));
        Temporal temporal3 = temporal1.plus(Period.ofDays(10));
        

        System.out.println(temporal1);
        System.out.println(temporal2);
        System.out.println(temporal3);

    }

    @Test
    void temporalUnit() {

        long temporalUnit1 = ChronoUnit.DAYS.between(LocalDateTime.now(), LocalDateTime.now().plusHours(40));
        long temporalUnit2 = ChronoUnit.MINUTES.between(LocalDateTime.now(), LocalDateTime.now().plusHours(40));
        long temporalUnit3 = ChronoUnit.SECONDS.between(LocalDateTime.now(), LocalDateTime.now().plusHours(40));
        long temporalUnit4 = ChronoUnit.MILLIS.between(LocalDateTime.now(), LocalDateTime.now().plusHours(40));

        System.out.println(temporalUnit1);
        System.out.println(temporalUnit2);
        System.out.println(temporalUnit3);
        System.out.println(temporalUnit4);

    }

    @Test
    void temporalField() {

        LocalDateTime temporal = LocalDateTime.now();

        System.out.println(temporal.get(ChronoField.YEAR));
        System.out.println(temporal.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(temporal.get(ChronoField.DAY_OF_MONTH));
        System.out.println(temporal.get(ChronoField.HOUR_OF_DAY));
        System.out.println(temporal.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(temporal.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println(temporal.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(temporal.get(ChronoField.NANO_OF_SECOND));
        System.out.println(temporal.getNano());

    }

    @Test
    void temporalQuery() {

        Temporal temporal = LocalDateTime.now();

        List<Integer> integers = temporal.query(new TemporalQuery<List<Integer>>() {
        @Override
        public List<Integer> queryFrom(TemporalAccessor temporal) {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(temporal.get(ChronoField.YEAR));
            list.add(temporal.get(ChronoField.MONTH_OF_YEAR));
            list.add(temporal.get(ChronoField.DAY_OF_MONTH));

            return list;
        }
        });

        System.out.println(integers);

    }

    @Test
    void temporalAdjuster() {

        Temporal temporal1 = LocalDate.now();
        System.out.println(temporal1);

        Temporal temporal2 = temporal1.with(new TemporalAdjuster() {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            return LocalDate.of(
                temporal.get(ChronoField.YEAR),
                temporal.get(ChronoField.MONTH_OF_YEAR),
                1
            );
        }
        });
        System.out.println(temporal2);

        Temporal temporal3 = temporal1.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(temporal3);
        Temporal temporal4 = temporal1.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(temporal4);

    }
}
