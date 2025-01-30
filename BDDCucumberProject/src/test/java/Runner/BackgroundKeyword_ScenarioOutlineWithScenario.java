package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile\\BackgrounKeyword_ScenarioOutlineWithScenario.feature"},
		glue= {"Steps"},
		publish=true
		//plugin = {"pretty"}
		
		)

public class BackgroundKeyword_ScenarioOutlineWithScenario extends AbstractTestNGCucumberTests{

}
