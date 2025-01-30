package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile\\UseOfBackground.feature"},
		glue= {"Steps"}
		
		)

public class UseOfBackgroundRunner extends AbstractTestNGCucumberTests
{

}
