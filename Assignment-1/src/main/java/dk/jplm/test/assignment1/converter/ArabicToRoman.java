package dk.jplm.test.assignment1.converter;

import java.util.List;

// Example made by Baeldung

/* Sudo code:
LET numeral be the input String representing an Roman Numeral
LET symbol be initialy set to RomanNumeral.values()[0]
WHILE numeral.length > 0:
    IF numeral starts with symbol's name:
        add symbol's value to the result
        remove the symbol's name from the numeral's beginning
    ELSE:
        set symbol to the next symbol
 */
public class ArabicToRoman {

    private ArabicToRoman() {
        System.out.println("Lint was making noise so I made a private constructor");
    }

    public static int romanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
        }

        return result;
    }

    /*
    Sudo code:
    LET number be an integer between 1 and 4000
    LET symbol be RomanNumeral.values()[0]
    LET result be an empty String
    WHILE number > 0:
        IF symbol's value <= number:
            append the result with the symbol's name
            subtract symbol's value from number
        ELSE:
            pick the next symbol
     */
    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}
