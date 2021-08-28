package chapter_3.manipulating_date_times_with_periods;

import java.time.LocalDateTime;
import java.time.Period;

public class ManipulatingDateTimes {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        //subtracting days
//        System.out.println(ldt);
//        ldt = ldt.minusDays(2);
//        System.out.println(ldt);

//        Period period = Period.ofDays(2);
//        ldt = ldt.minus(period);

        //more complex period of time
        Period period2 =  Period.of(1, 3, 2);
//        ldt = ldt.plus(period2);
//        System.out.println(ldt);

//        Period badPeriod = Period.ofYears(1).ofMonths(3).ofDays(2);
//        System.out.println(ldt.plus(badPeriod));

        printPeriod5Times(period2);
    }

    public static void printPeriod5Times(Period period){
        LocalDateTime now = LocalDateTime.now();
        for (int i = 0; i < 5; i++) {
            now = now.plus(period);
            System.out.println(now);
        }
    }
}
