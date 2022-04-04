package info.manavas.datatime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneExample {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
        System.out.println("Europe/Madrid: " + ZonedDateTime.now(ZoneId.of("Europe/Madrid")));
        System.out.println("Europe/London: " + ZonedDateTime.now(ZoneId.of("Europe/London")));
        System.out.println("America/New_York: " + ZonedDateTime.now(ZoneId.of("America/New_York")));
        System.out.println("Japan: " + ZonedDateTime.now(ZoneId.of("Japan")).toLocalDateTime().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }
}
