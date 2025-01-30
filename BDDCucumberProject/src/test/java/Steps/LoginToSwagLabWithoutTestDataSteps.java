package Steps;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginToSwagLabWithoutTestDataSteps 
{
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() 
	{
		System.out.println("User is on login page");
	    
	}

	@When("User enter username")
	public void user_enter_username() 
	{
		System.out.println("User enter username");
	    
	}

	@When("User enter password")
	public void user_enter_password() 
	{
		System.out.println("User enter password");
	    
	}

	@When("User click on Login button")
	public void user_click_on_login_button()
	{
		 System.out.println("User click on Login Button");
	    
	}

	@Then("User should be on Homepage")
	public void user_should_be_on_homepage()
	{
		System.out.println("User should be on Homepage");
	}

	@Then("Title of application should be visible")
	public void title_of_application_should_be_visible()
	{
		System.out.println("Title of application should displayed");
	    
	}

	
	
	 /*@Given("User is on login page")
	public void user_is_on_login_page() 
	{
	    System.out.println("User is on login page");
	}

	@When("User enter username")
	public void user_enter_username() 
	{
	    System.out.println("User enter username");
	}

	@When("User enter password")
	public void user_enter_password() 
	{
	    System.out.println("User enter password");
	}

	@When("User click on Login button")
	public void user_click_on_login_button()
	{
	    System.out.println("User click on Login Button");
	}

	@Then("User should be on Homepage")
	public void user_shoul_be_on_homepage() 
	{
	   System.out.println("User should be on Homepage");
	}
	
	
	@Then("Title of application should be visible")
	public void title_of_application_should_be_visible() {
	    System.out.println("Title of application should displayed");
	}
*/

}
