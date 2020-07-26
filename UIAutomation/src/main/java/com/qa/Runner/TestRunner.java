package com.qa.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"D:/NAL_SeleniumJava_Workspace/UIAutomation/src/main/java/com/qa/feature/nabHomeloan.feature"},
		glue= {"com/qa/stepDefinition"},
		format= {"pretty","html:test-output"},
		monochrome=true,
		strict=true,
		dryRun=false		
		)

public class TestRunner {

}
