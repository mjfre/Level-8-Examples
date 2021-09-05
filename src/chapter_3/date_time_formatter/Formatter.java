package chapter_3.date_time_formatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatter {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(1990, Month.AUGUST, 3, 4, 17, 37);

        LocalDate ld = LocalDate.of(1990, Month.AUGUST, 3);

        LocalTime lt = LocalTime.of(4, 17, 37);

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(ldt.format(shortFormatter));
        System.out.println(shortFormatter.format(ldt));

        System.out.println(lt.format(mediumFormatter));
        System.out.println(ld.format(shortFormatter));

        DateTimeFormatter formatterPattern = DateTimeFormatter.ofPattern("MMMM dd, yy @ HH:mm");
//        System.out.println(ldt.format(formatterPattern));


    }
}
