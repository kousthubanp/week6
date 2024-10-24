package salesrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/sales.feature", glue="stepdefinition", publish=true)
public class Salesrunner extends AbstractTestNGCucumberTests {

	}

