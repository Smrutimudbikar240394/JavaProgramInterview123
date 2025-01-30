package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile\\ScenarioOutlineExamples.feature"},
		glue= {"Steps"},
		publish=true
		
		)

public class ScenarioOutlineRunner extends AbstractTestNGCucumberTests {

}
