package dk.jplm.test.assignment1.converter;

public class Converter {
    // Formula: Celcius   =  (F  -  32  ) ×  5)/9
    // int celcius;
    // int fahrenheit;

    public double convertFromFahrenheitToCelcius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    // Formula: Fahrenheit   =  C × 9/5 + 35
    public double convertFromCelciusToFahrenheit(double celcius) {
        double fahrenheit = ((9 * celcius) / 5 + 32);
        return fahrenheit;
    }

}
