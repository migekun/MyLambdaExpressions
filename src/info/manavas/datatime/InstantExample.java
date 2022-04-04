package info.manavas.datatime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantExample {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        System.out.println("timestamp.getNano() = " + timestamp.getNano());

        Instant timestamp1 = Instant.now().plusSeconds(3600);
        Duration duration = Duration.between(timestamp, timestamp1);
        System.out.println("duration = " + duration.toSeconds());

        LocalDateTime localDateTime = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
        System.out.println("localDateTime = " + localDateTime);
    }
}
