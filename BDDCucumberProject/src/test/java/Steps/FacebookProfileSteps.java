package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookProfileSteps
{
	@When("User should click on profile icon")
	public void user_should_click_on_profile_icon() {
	    System.out.println("User click on profile icon");
	}

	@Then("profile icon displayed on facebook page")
	public void profile_icon_displayed_on_facebook_page() 
	{
		System.out.println("Profile icon displayed on facebook page");
	    
	}


}
