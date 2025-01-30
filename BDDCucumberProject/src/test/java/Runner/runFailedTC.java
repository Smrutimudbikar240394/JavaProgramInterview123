package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"@target/ReRunFailedTC/failedcampagin2.txt"},
		glue= {"Steps"},
		publish=true
		
		//plugin= {"pretty","xml:ExecutionReport/failedTCReport1.html"}
		
	
		
		)

public class runFailedTC extends AbstractTestNGCucumberTests
{
	

}
