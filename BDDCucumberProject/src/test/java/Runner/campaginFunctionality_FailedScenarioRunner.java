package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile\\campaginFunctionality_FailedScenariofeature.feature"},
		glue= {"Steps"},
		publish=true,
		
		//plugin= {"pretty","xml:ExecutionReport/report2_GenerateReport2.html"}
		
		plugin= {"rerun:target/ReRunFailedTC/failedcampagin2.txt"}
		
		)



public class campaginFunctionality_FailedScenarioRunner extends AbstractTestNGCucumberTests
{

}
