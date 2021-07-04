package de.htwberlin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {
    private String input = "";
    private String output;
    TimeConversion timeConversion = new TimeConversion(input);

    @Test
    void timeConversion12To24() {
        input = "07:05:45 PM";
        output = "19:05:45";
        assertEquals(output,timeConversion.timeConversion12To24(input));
    }
}