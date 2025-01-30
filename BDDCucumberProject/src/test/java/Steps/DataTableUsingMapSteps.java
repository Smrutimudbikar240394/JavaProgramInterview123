package Steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableUsingMapSteps 
{
	@Given("User should be at account opening page using map")
	public void user_should_be_at_account_opening_page_using_map() 
	{
		System.out.println("User should be at account opening page using map");
	   
	}

	@When("User enters following data using map")
	public void user_enters_following_data_using_map(DataTable dt) 
	{
		List<Map<String, String>> data = dt.asMaps();
		
		System.out.println(data.get(1).get("FN"));
	   
	}


}
