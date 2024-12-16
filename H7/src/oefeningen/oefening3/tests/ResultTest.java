package oefeningen.oefening3.tests;

import oefeningen.oefening3.Result;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class ResultTest {

    public static final String NAME = "Guido";
    public static final LocalDateTime DATETIME = LocalDateTime.of(1991, 3, 3, 20, 15, 15);
    public static final double RESULT = 5.15;
    public static final String FILEOUTPUT = "1991-03-03-20:15:15#Guido#5,150";

    @Test
    public void testToFileWithParamConstructor() {
       Result result = new Result(NAME, DATETIME, RESULT);

       assertEquals(RESULT, result.getResult(), 0.001);
       assertEquals(FILEOUTPUT, result.toFile());
    }

    @Test
    public void testToFileWithArrayConstructor() {
        String[] data = new String[]{"1991-03-03-20:15:15", "Guido", "5.150"};
        Result result = new Result(data);

        assertEquals(RESULT, result.getResult(), 0.001);
        assertEquals(FILEOUTPUT, result.toFile());
    }

}
