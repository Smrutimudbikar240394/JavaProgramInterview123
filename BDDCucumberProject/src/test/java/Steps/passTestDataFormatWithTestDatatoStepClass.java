package Steps;

import io.cucumber.java.en.When;

public class passTestDataFormatWithTestDatatoStepClass 
{
	@When("User enter username like {string}")
	public void user_enter_username_like(String username)
	{
		System.out.println("User enter username like :  "+username);
	
	}

	@When("User enter password like {string}")
	public void user_enter_password_like(String password) 
	{
		System.out.println("User enter password like :      "+password);
	   
	}

	@When("User enter pin like {int}")
	public void user_enter_pin_like(Integer pin)
	{
	    System.out.println("User enter pin :  "+pin);
	}



}
