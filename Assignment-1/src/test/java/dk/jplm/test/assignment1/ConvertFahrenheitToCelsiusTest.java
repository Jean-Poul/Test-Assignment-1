package dk.jplm.test.assignment1;

import dk.jplm.test.assignment1.converter.Converter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ConvertFahrenheitToCelsiusTest {

    Converter converter = new Converter();

    @Test
    void testOfFahrenheitToCelsiusConversion() {
        double expected = 20;
        double actual = converter.convertFromFahrenheitToCelcius(68);
        assertEquals(expected, actual);
    }

}
