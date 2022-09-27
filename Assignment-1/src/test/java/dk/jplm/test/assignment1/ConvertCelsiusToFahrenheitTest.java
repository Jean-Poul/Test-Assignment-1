package dk.jplm.test.assignment1;

import dk.jplm.test.assignment1.converter.Converter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ConvertCelsiusToFahrenheitTest {

    Converter converter = new Converter();

    @Test
    void testOfCelsiusToFahrenheitConversion() {
        double expected = 50;
        double actual = converter.convertFromCelciusToFahrenheit(10);
        assertEquals(expected, actual);
    }
}
