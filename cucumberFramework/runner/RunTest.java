package runner;

import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/java/features/Login.feature",
					"src/test/java/features/invalidLogin.feature"},
                  glue= "steps",
                  monochrome = true,
                  plugin= {"pretty","html:reports/login.html"},
                  tags= {"~@Regression"}
                  )
public class RunTest extends AbstractTestNGCucumberTests {
	
	

}
