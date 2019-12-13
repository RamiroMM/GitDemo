package stepDefinitions;

//import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {
	
	@Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
        //throw new PendingException();
		System.out.println("Validating the browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        //throw new PendingException();
    	System.out.println("Triggering the browser");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        //throw new PendingException();
    	System.out.println("Starting the browser");
    }

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //throw new PendingException();
    	System.out.println("Navigated to URL");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        //throw new PendingException();
    	System.out.println("Logged in successfully");
    }
    
    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        //throw new PendingException();
    	System.out.println("Logged in successfully");
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @Then("^Home page is loaded$")
    public void home_page_is_loaded() throws Throwable {
        //throw new PendingException();
    	System.out.println("Validated home page");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        //throw new PendingException();
    	System.out.println("Cards are validated");
    }
    
    @And("^Cards displayed is \"([^\"]*)\"$")
    public void cards_displayed_is_something(String strArg1) throws Throwable {
        //throw new PendingException();
    	System.out.println(strArg1);
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable table) throws Throwable {
        //throw new PendingException();
    	List<List<String>> list = table.asLists();
    	System.out.println(list.get(0).get(0));
    	System.out.println(list.get(0).get(1));
    	System.out.println(list.get(0).get(2));
    	System.out.println(list.get(0).get(3));
    	System.out.println(list.get(0).get(4));
    }
    
    @When("^User login in to application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
        //throw new PendingException();
    	System.out.println(username + " " + password);
    }

}
    