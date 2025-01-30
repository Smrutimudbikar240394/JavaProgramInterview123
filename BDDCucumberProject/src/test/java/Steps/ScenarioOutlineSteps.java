package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps 
{
	@Given("User in at signup page")
	public void user_in_at_signup_page() 
	{
		System.out.println("User in at signup page");
	    
	}

	@When("User enters name  {string} inside form")
	public void user_enters_name_inside_form(String studName) 
	{
		System.out.println("User enters name   inside form : "+studName);
	    
	}

	@When("User enters age as {string}")
	public void user_enters_age_as(String age) 
	{
		System.out.println("User enters age : "+age);
	    
	}

	@When("User confirm gender as {string}")
	public void user_confirm_gender_as(String gender) 
	{
		System.out.println("User confirm gender as :"+gender);
	    
	}

	@Then("User gets created")
	public void user_gets_created() 
	{
		System.out.println("User gets created");
	   
	}


}
