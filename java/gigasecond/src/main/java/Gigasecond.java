import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Gigasecond {
    private final LocalDateTime moment;

    Gigasecond(LocalDate moment) {
        this.moment = LocalDateTime.of(moment, LocalTime.MIDNIGHT);
    }

    Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    LocalDateTime getDateTime() {
        return moment.plus(Duration.ofSeconds(1000000000L));
    }

}
