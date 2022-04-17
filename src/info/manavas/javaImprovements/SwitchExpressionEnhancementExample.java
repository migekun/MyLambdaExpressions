package info.manavas.javaImprovements;

import java.time.LocalDate;

public class SwitchExpressionEnhancementExample {
    public static void main(String[] args) {
        String month = "JANUARY";
        String quarter = switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                var isLeapYear = LocalDate.now().isLeapYear();
                yield (isLeapYear ? "FIRST QUARTER - LEAP YEAR" : "FIRST QUARTER");
            }
            case "APRIL", "MAY", "JUNE" -> "SECOND QUARTER";
            case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD QUARTER";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOURTH QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        System.out.println("quarter = " + quarter);
    }
}
