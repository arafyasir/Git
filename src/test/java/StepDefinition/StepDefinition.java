package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {
	
	@Given("^user is on netbanking login page$")
    public void user_is_on_netbanking_login_page() throws Throwable {
System.out.println("ok1");
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("ok2");
    }

    @Then("^homepage is populated$")
    public void homepage_is_populated() throws Throwable {
    	System.out.println("ok3");
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("ok4");
    }
    @When("^user login into application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
    	System.out.println(username);
    	System.out.println(password);
    }


}