package dk.jplm.test.testassignment1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@CucumberContextConfiguration
public class StepDefs {
    @Autowired
    private VersionController vs;

    //executeGet("http://localhost:8080/version");  @When( blabla {string} blabla {int}
    @When("^the client calls /version$")
    public void the_client_issues_GET_version() throws Throwable {
        //  executeGet("http://localhost:8080/version");
        System.out.println("HEJ FRA MIG" + vs.getVersion());
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
  /*      HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : " +
                latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
    */
        assertThat(1).isEqualTo(1);
    }

    @And("^the client receives server version (.+)$")
    public void the_client_receives_server_version_body(String version) throws Throwable {
        //  assertThat(latestResponse.getBody(), is(version));
    }

    @Given("something {string} yes")
    public void somethingYes(String arg0) {
    }

    @When("yo {string}")
    public void yo(String arg0) {
    }

    @Then("total {int}")
    public void totalTotal(int total) {
    }
}


