package de.htwberlin;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class TimeConversion {
    private String twelveHoursTime;


    public TimeConversion(String twelveHoursTime) {
        this.twelveHoursTime = twelveHoursTime;

    }

    public String timeConversion12To24(String twelveHoursTime) {
        String result = LocalTime.parse(twelveHoursTime,
                DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.GERMANY))
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return result;
    }
}
