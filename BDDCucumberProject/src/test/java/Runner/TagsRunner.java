package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"E:\\JAVA VEL\\BDDCucumberProject\\src\\test\\resources\\FeatureFile\\tags.feature"},
		glue= {"Steps"},
		publish=true,
		//tags="@smoke and @regression"
		//tags="@smoke or @regression"
		//tags="not @smoke"
		//tags="@positive"
		tags="@smoke"
		
		
		
		)

public class TagsRunner extends AbstractTestNGCucumberTests{

}
