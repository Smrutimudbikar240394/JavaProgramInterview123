package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile\\LoginToFacebookApp.feature" ,
				   "E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile\\UseOfBackground.feature"},
		glue= {"Steps"},
		publish=true
		
		
		)

public class RunMultipleFeatureFile extends AbstractTestNGCucumberTests
{
	

}
