import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private static final int GIGA_SECOND = 1_000_000_000;

    private final LocalDateTime momentPlusAGigaSecond;

    Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        this.momentPlusAGigaSecond = moment.plusSeconds(GIGA_SECOND);
    }

    LocalDateTime getDateTime() {
        return momentPlusAGigaSecond;
    }

}
