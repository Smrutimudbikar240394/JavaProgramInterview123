package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tagsSteps
{
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() 
	{
		System.out.println("the user is on the login page");
		
	    
	}

	@When("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() 
	{
		System.out.println("the user enters valid username and password");
	    
	}

	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() 
	{
		System.out.println("the user should be redirected to the dashboard");
	    
	}

	@When("the user enters invalid username or password")
	public void the_user_enters_invalid_username_or_password()
	{
		System.out.println("the user enters invalid username or password");
	    
	}

	@Then("an error message should be displayed")
	public void an_error_message_should_be_displayed() 
	{
		System.out.println("an error message should be displayed");
	    
	}

	@When("the username and password fields are empty")
	public void the_username_and_password_fields_are_empty() 
	{
	    System.out.println("the username and password fields are empty");
	}

	@Then("the login button should be disabled")
	public void the_login_button_should_be_disabled() 
	{
	    System.out.println("the login button should be disabled");
	}


}
