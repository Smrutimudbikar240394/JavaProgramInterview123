package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		features= {"E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile\\LoginToFacebookProfile.feature"},
		glue= {"Steps"}
		
		)

public class FacebookProfileRunner extends AbstractTestNGCucumberTests
{

}
