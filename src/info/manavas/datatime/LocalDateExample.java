package info.manavas.datatime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {
    public static void main(String[] args) {
        //Creating LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate.now = " + localDate);

        //using day of the year
        localDate = LocalDate.ofYearDay(2008, 35);
        System.out.println("localDate.ofYearDay = " + localDate);

        localDate = LocalDate.of(2018, 5, 23);
        System.out.println("localDate.of = " + localDate);

        localDate = LocalDate.now();

        //Get Methods
        System.out.println("localDate.getMonth() = " + localDate.getMonth());
        System.out.println("localDate.getMonthValue() = " + localDate.getMonthValue());
        System.out.println("localDate.getDayOfWeek() = " + localDate.getDayOfWeek());
        System.out.println("localDate.getDayOfYear() = " + localDate.getDayOfYear());
        System.out.println("localDate.get(ChronoField.DAY_OF_MONTH) = " + localDate.get(ChronoField.MONTH_OF_YEAR));


    }
}
