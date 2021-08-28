package chapter_3.creating_date_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CreatingDateTimes {

    public static void main(String[] args) {
//        LocalDate l = new LocalDate();

        LocalDate l1 = LocalDate.now();
        System.out.println(l1);

        LocalTime t1 = LocalTime.now();
        System.out.println(t1);

        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(dt1);

        LocalDateTime dt2 = LocalDateTime.of(1990, Month.AUGUST, 3, 3, 27);
        System.out.println(dt2);
    }
}
