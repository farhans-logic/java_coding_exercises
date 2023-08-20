package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private final LocalDateTime localDateTime;
    private final long GIGA_SECOND = (long) Math.pow(10, 9);

    public Exercise004(LocalDate date) {
        this.localDateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.localDateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return localDateTime.plusSeconds(GIGA_SECOND);
    }
}
