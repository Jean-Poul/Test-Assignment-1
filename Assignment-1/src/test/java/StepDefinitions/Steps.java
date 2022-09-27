package StepDefinitions;

import dk.jplm.test.assignment1.converter.Converter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import io.cucumber.junit.platform.engine.Cucumber;

//@Cucumber
public class Steps {
    // First cucumber test setup
    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("The user is on login page");
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("Entered username and password");
    }

    @When("hits submit")
    public void hits_submit() {
        System.out.println("Clicked on submit");
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("Yeah I am logged in");
    }


    // Celsius to fahrenheit cucumber test
    private double fahrenheit;
    private Converter converter;

    // Arrange
    @Given("the user provides a valid measurement")
    public void the_user_provides_a_valid_measurement() {
        converter = new Converter();
    }

    // Act
    @When("wanting to view celsius: {double} conversion")
    public void wanting_to_view_celsius_conversion(Double celsius) {
        System.out.println("Celsius user input: " + celsius);
        double userCelsiusInput = celsius;
        this.fahrenheit = converter.convertFromCelciusToFahrenheit(userCelsiusInput);
        System.out.println(this.fahrenheit);
    }

    // Assert
    @Then("the user will be shown the conversion in fahrenheit: {double}")
    public void the_user_will_be_shown_the_conversion_in_fahrenheit(Double actualFahrenheit) {
        assertThat(this.fahrenheit).isEqualTo(actualFahrenheit);
    }


    // Fahrenheit to Celsius cucumber test

    // Roman to Arabic cucumber test


}
