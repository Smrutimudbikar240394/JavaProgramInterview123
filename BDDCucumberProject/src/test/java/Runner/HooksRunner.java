package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile\\Hooks.feature"},
		glue= {"Steps","Hooks"},
		publish=true
		
		
		)

public class HooksRunner extends AbstractTestNGCucumberTests
{

}
