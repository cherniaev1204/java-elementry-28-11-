package lessons.lesson9;


import jdk.swing.interop.SwingInterOpUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate dateOfBirth = LocalDate.of(2020, 4, 15);
        System.out.println(dateOfBirth);

        LocalDate anotherDate = LocalDate.parse("1981-05-30");
        System.out.println(anotherDate);

        System.out.println(anotherDate.getMonth());

        System.out.println(anotherDate.isAfter(dateOfBirth));
        System.out.println(anotherDate.isBefore(dateOfBirth));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time1 = LocalTime.of(11, 50);
        System.out.println(time1);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.parse("2021-01-01T06:00");
        System.out.println(localDateTime1);

        System.out.println(localDateTime.plusYears(50));


        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yy MM dd")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd MMM yyy")));

        ZoneId zoneId = ZoneId.of("CET");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2021, 4,5, 1, 3, 4, 12334, zoneId);
        System.out.println(zonedDateTime);
        System.out.println(ZonedDateTime.now());
    }

}
