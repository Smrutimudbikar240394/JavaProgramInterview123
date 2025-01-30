package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginToFacebookSteps 
{
	@Given("User is on facebook login page")
	public void user_is_on_facebook_login_page()
	{
		System.out.println("User is on facebook login page");
	  
	}

	@When("Enter username")
	public void enter_username() 
	{
		System.out.println("Enter username");
	   
	}

	@When("Enter password")
	public void enter_password()
	{
		System.out.println("Enter password");
	    
	}

	@When("User click on loginbutton")
	public void user_click_on_loginbutton()
	{
		System.out.println("User click on loginbutton");
	    
	}

	@Then("User should be on facebook homepage")
	public void user_should_be_on_facebook_homepage() 
	{
		System.out.println("User should be on facebook homepage");
	    
	}

	@Given("User is on  facebook login page")
	public void user_is_on_facebook_login_page1() 
	{
		System.out.println("User is on facebook login page 1");
	    
	}

	@When("user click on forget password link")
	public void user_click_on_forget_password_link() 
	{
		System.out.println("user click on forget password link");
	   
	}

	@Then("title of facebook application should display on forget password page")
	public void title_of_facebook_application_should_display_on_forget_password_page()
	{
	  System.out.println("title of facebook application should display on forget password page");  
	}

	@Given("User should login with valid credentials")
	public void user_should_login_with_valid_credentials() 
	{
	    System.out.println("User should login with valid credentials");
	}

	@When("User click homepage button")
	public void user_click_homepage_button() 
	{
		System.out.println("User click homepage button");
	    
	}

	@When("User click on more button")
	public void user_click_on_more_button()
	{
	 System.out.println("User click on more button");
	}

	@When("User should click on notification icon")
	public void user_should_click_on_notification_icon()
	{
		System.out.println("User should click on notification icon");
	    
	}

	@Then("Notification icon displayed on facebook page")
	public void notification_icon_displayed_on_facebook_page() 
	{
		System.out.println("Notification icon displayed on facebook page");
	    
	}

}
