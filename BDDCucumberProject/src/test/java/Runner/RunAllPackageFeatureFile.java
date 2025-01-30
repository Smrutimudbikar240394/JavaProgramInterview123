package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile"},
		glue= {"Steps"},
		publish=true
		
		
		)

public class RunAllPackageFeatureFile extends AbstractTestNGCucumberTests {

}
