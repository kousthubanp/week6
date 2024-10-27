package stepdefinition;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdef {
	public ChromeDriver driver;
	@Given("Launch the browser")
	public void launch_the_browser() {
	    driver = new ChromeDriver();
	}

@When("Load the url")
public void load_the_url() {
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
}
	@When("Enter in the username as {string}")
	public void enter_in_the_username_as_demo_csr(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@When("Enter in the password as crmsfa")
	public void enter_in_the_password_as_crmsfa() {
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click the Login Button")
	public void click_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should move to Homepage")
	public void it_should_move_to_homepage() {
		String valid = driver.findElement(By.xpath("//h2[text()='Welcome ']")).getText();
		if (valid.contains("Welcome")) {
			System.out.println("It was navigated to the next page");
		}
		else {
			System.out.println("Not Navigated");
		}
	}
}
