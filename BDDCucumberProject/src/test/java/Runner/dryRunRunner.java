package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile\\dryRunFeature.feature"},
		glue= {"Steps"},
		publish=true,
		dryRun=true
		
		)


public class dryRunRunner extends AbstractTestNGCucumberTests{

}
