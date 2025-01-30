package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile\\UseOfBackground.feature"},
		glue= {"Steps"},
		publish=true,
		
		//plugin= {"pretty","html:ExecutionReport/report1_GenerateReport.html"}
		
		plugin= {"pretty","xml:ExecutionReport/report2_GenerateReport2.html"}
		
		
		)



public class GenerateReport extends AbstractTestNGCucumberTests
{

}
