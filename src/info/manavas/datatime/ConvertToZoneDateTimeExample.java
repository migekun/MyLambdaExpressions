package info.manavas.datatime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ConvertToZoneDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Europe/Madrid"));
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("localDateTime = " + localDateTime.atOffset(ZoneOffset.ofHours(-10)));
        System.out.println("localDateTime = " + localDateTime.atZone(ZoneId.of("Japan")));
    }
}
