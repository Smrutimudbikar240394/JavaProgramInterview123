package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UseOfBackgroundSteps 
{
	@Then("get Title and verify")
	public void get_title_and_verify() {
	    System.out.println("Get Title and verified");
	}

	@When("User click on profile tab")
	public void user_click_on_profile_tab() {
	    System.out.println("User click on profile tab");
	}

	@Then("get Profile name and validate")
	public void get_profile_name_and_validate() {
	   System.out.println("get Profile name and validate");
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() 
	{
		System.out.println("User click on logout button");
	    
	}

	@Then("logout from application")
	public void logout_from_application() {
	    System.out.println("logout from application");
	}

}
