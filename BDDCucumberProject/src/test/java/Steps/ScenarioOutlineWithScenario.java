package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ScenarioOutlineWithScenario 
{
	@Given("User at login page")
	public void user_at_login_page() {
	  System.out.println("User at login page");
	}

	@Then("URL contains {string}")
	public void url_contains(String url) {
	    System.out.println("Url contains:  "+url);
	}

}
