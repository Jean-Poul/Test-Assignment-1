package dk.jplm.test.assignment1;

import dk.jplm.test.assignment1.converter.ArabicToRoman;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class ConvertArabicToRomanTest {

    @Test
    void given2018Roman_WhenConvertingToArabic_ThenReturn2018() {
        String roman2018 = "MMXVIII";

        int result = ArabicToRoman.romanToArabic(roman2018);
        
        assertThat(result).isEqualTo(2018);
    }

    @Test
    void given1999Arabic_WhenConvertingToRoman_ThenReturnMCMXCIX() {
        int arabic1999 = 1999;

        String result = ArabicToRoman.arabicToRoman(arabic1999);

        assertThat(result).isEqualTo("MCMXCIX");
    }

}
