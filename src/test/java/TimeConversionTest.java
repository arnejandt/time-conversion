import de.htwberlin.TimeConversion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


class TimeConversionTest {
    private String input = "";
    private String output;
    TimeConversion timeConversion = new TimeConversion(input);

    @Test
    @DisplayName("Number one")
    void timeConversion12To24One() {
        input = "07:05:45 PM";
        output = "19:05:45";
        assertEquals(output,timeConversion.timeConversion12To24(input));

    }


    @Test
    @DisplayName("Number two")
    void timeConversion12To24Two(){
        input = "07:05:32 AM";
        output = "07:05:32";
        assertEquals(output,timeConversion.timeConversion12To24(input));
    }

    @Test
    @DisplayName("Number three")
    void timeConversion12To24Three(){
        input = "12:05:29 PM";
        output = "12:05:29";
        assertEquals(output,timeConversion.timeConversion12To24(input));
    }

    @Test
    @DisplayName("Number four")
    void timeConversion12To24Four(){
        input = "12:05:00 AM";
        output = "00:05:00";
        assertEquals(output,timeConversion.timeConversion12To24(input));
    }




}