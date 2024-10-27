package salesrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/Static.feature", glue="staticstepdef", publish=true)
public class Staticrunner extends AbstractTestNGCucumberTests {

	}