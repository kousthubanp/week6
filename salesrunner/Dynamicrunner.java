package salesrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/Dynamic.feature", glue="dynamicstepdef", publish=true)
public class Dynamicrunner extends AbstractTestNGCucumberTests {

	}
