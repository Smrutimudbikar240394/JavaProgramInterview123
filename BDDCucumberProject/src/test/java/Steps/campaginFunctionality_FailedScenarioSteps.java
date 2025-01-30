package Steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class campaginFunctionality_FailedScenarioSteps 
{
	@Given("user is at campaigns page")
	public void user_is_at_campaigns_page() {
	    System.out.println("user is at campaigns page");
	}

	@When("user click on create campaign button")
	public void user_click_on_create_campaign_button() {
	   System.out.println("user click on create campaign button");
	}

	@When("user click on save button")
	public void user_click_on_save_button() 
	{
		//Assert.assertEquals("Hi","Hello","--------Error in assertion-----------");
	    System.out.println("user click on save button");
	}

	@Then("campaign should get created")
	public void campaign_should_get_created() {
	   System.out.println("campaign should get created");
	}


}
