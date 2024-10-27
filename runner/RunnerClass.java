package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/main/java/feature/login.feature", glue="stepdefinition", publish=true,tags="@smoke")
public class RunnerClass extends AbstractTestNGCucumberTests {

}
