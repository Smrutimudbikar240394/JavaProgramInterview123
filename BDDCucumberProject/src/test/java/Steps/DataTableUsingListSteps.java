package Steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableUsingListSteps 
{
	@Given("User should be at account opening page")
	public void user_should_be_at_account_opening_page() 
	{
	    System.out.println("User should be at account opening page\"");
	}

	@When("User enters following data")
	public void user_enters_following_data(DataTable dt) 
	{
			List<List<String>> data = dt.asLists();
			
			String value=data.get(0).get(1);
			System.out.println(value);
			
			String Value2=data.get(1).get(2);
			System.out.println(Value2);
	    
	}

}
