package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile\\LoginToSwagLabWithoutTestData.feature"},
		glue= {"Steps"}
		
		)

public class LoginToAppRunner extends AbstractTestNGCucumberTests
{

}
