package chapter_3.date_time_practice;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DateTimePractice_Solutions {

    public static void main(String[] args) {
        method9(Period.of(1, 1, 1), LocalDate.now());
    }

    //Print out the current LocalDateTime
    public static void method1() {
        System.out.println(LocalDateTime.now());
    }

    //Print out the current LocalTime
    public static void method2() {
        System.out.println(LocalTime.now());
    }

    //Print out the current LocalDateTime in short format
    public static void method3() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(formatter.format(LocalDateTime.now()));
    }

    //Print out the current LocalDateTime in medium format
    public static void method4() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(LocalDateTime.now().format(formatter));
    }

    //Print out the current local date time in format: e.g. August 03, 1990 @ 3:30
    public static void method5() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy @ h:mm");
        System.out.println(formatter.format(LocalDateTime.now()));
    }

    //Print out the current local time in ISO_LOCAL_TIME
    public static void method6(){
        LocalTime lt = LocalTime.now();
        System.out.println(lt.format(DateTimeFormatter.ISO_LOCAL_TIME));
    }

    //Take in int month, int day, int year, and print out the date in 3 month intervals for 3 years
    public static void method7(int month, int day, int year) {
        Period p = Period.ofMonths(3);
        LocalDate ld = LocalDate.of(year, month, day);
        for (int i = 0; i < 12; i++) {
            ld = ld.plus(p);
            System.out.println(ld);
        }
    }

    //Take in int month, int day, int year for the date of birth, then print out the users 16th, 21st, 30th, and 100th birthdays
    public static void method8(int month, int day, int year) {
        LocalDate ld = LocalDate.of(year, month, day);

        Period p = Period.ofYears(16);
        System.out.println(ld.plus(p));

        p = Period.ofYears(21);
        System.out.println(ld.plus(p));

        p = Period.ofYears(30);
        System.out.println(ld.plus(p));

        p = Period.ofYears(100);
        System.out.println(ld.plus(p));
    }

    //Given a Period and a LocalDate, print out the Date in ISO_LOCAL_DATE format for the next 4 periods
    public static void method9(Period period, LocalDate localDate){
        for(int i=0; i<4; i++){
            localDate = localDate.plus(period);
            System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
    }

    //Take in int month, int day, int year for the date of birth, then print out the users Golden birthday (where age and day of month are the same)
    public static void method10(int month, int day, int year) {
//        LocalDate ld = LocalDate.of(year, month, day);
//
//        Period p = Period.ofYears(1);
//
//        for(int i=1; i<=31; i++){
//            ld = ld.plus(p);
//            if(ld.getDayOfMonth() == i){
//                System.out.println("You golden birthday is " + ld);
//            }
//        }

        LocalDate ld = LocalDate.of(year, month, day);
        Period p = Period.ofYears(day);
        System.out.println(ld.plus(p));
    }

    //Given a year, print out the next five leap years
    public static void method11(int year) {
        int leapYears = 0;
        while(leapYears<5){
            try {
                LocalDate ld = LocalDate.of(year++, 2, 29);
                leapYears++;
                System.out.println(ld.getYear());
            }
            catch(DateTimeException e){

            }
        }

//        int leapYears = 0;
//        while (leapYears < 5) {
//            LocalDate ld = LocalDate.of(year++, 1, 1);
//            if (Year.of(ld.getYear()).isLeap()) {
//                leapYears++;
//                System.out.println(ld.getYear());
//            }
//        }
    }

    //Given a year, print out the number of friday the 13ths in that year
    public static void method12(int year){
        int month = 1;
        int friday13Count = 0;
        while(month <= 12){
            LocalDate ld = LocalDate.of(year, month, 13);
            if(ld.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
                friday13Count++;
            }
            month++;
        }
        System.out.println(friday13Count);
    }


//    //Given a year, the most common day of the week for a leap year over the next 400 years
//    public static void method11(int year) {
//        int startYear = year;
//
//        Map<String, Integer> dayFrequencyCount = new HashMap<>() {{
//            put("SUNDAY", 0);
//            put("MONDAY", 0);
//            put("TUESDAY", 0);
//            put("WEDNESDAY", 0);
//            put("THURSDAY", 0);
//            put("FRIDAY", 0);
//            put("SATURDAY", 0);
//        }};
//
//        for (; year < startYear + 400; year++) {
//            if (Year.of(year).isLeap()) {
//                LocalDate localDate = LocalDate.of(year, 2, 29);
//                String dayOfWeek = localDate.getDayOfWeek().toString();
//                dayFrequencyCount.put(dayOfWeek, dayFrequencyCount.get(dayOfWeek) + 1);
//            }
//        }
//
//        System.out.println(dayFrequencyCount);
//        System.out.println(Collections.max(dayFrequencyCount.entrySet(), Map.Entry.comparingByValue()).getKey());
//
//    }
}
