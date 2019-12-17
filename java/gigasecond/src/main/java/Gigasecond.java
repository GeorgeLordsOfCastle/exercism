import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private static final int GIGA_SECOND = 1_000_000_000;

    private final LocalDateTime moment;

    Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    LocalDateTime getDateTime() {
        return moment.plusSeconds(GIGA_SECOND);
    }

}
