package dynamicstepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DynamicStepDefinition {

	public ChromeDriver driver;
	@Given("Launch the Webbrowser")
	public void launch_the_Webbrowser() {
	    driver = new ChromeDriver();
	}

	@When("load the url")
	public void load_the_url() {
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	}

	@When("Enter username dilip@testleaf.com")
	public void enter_in_the_username_as_dilip_testleaf_com() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	}

	@When("Enter password leaf@{int}")
	public void enter_password_as_leaf(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}

	@When("click on the toggle button on the left")
	public void click_on_the_toggle_button_on_the_left() {
		driver.findElement(By.xpath("//div[@class='slds-r8']/following-sibling::div[1]")).click();
	}

	@When("click on the view all")
	public void click_on_the_view_all() {
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	}

	@When("click on the sales tab")
	public void click_on_the_sales_tab() {
		driver.findElement(By.xpath("//p[@title='Manage your sales process with accounts, leads, opportunities, and more']")).click();
	}

	@When("click on the accounts tab")
	public void click_on_the_accounts_tab() {
		Actions act= new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()='Accounts']"));
		act.moveToElement(element).perform();
		act.click(element).perform();
	}

	@When("click on the new tab")
	public void click_on_the_new_tab() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@When("Enter in the accountname as (.*)$")
	public void enter_in_the_account_name_as_kousthu(String accountname) throws InterruptedException {
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountname);
		Thread.sleep(5000);
	}

	@When("select public in ownership")
	public void select_public_in_ownership() {
		Actions act= new Actions(driver);
		WebElement element2 = driver.findElement(By.xpath("(//button[@data-value='--None--'])[3]"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element2);
		act.click(element2).perform();
		WebElement element = driver.findElement(By.xpath("//span[text()='Public']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element);
		act.click(element).perform();
	}

	@Then("Save and verify")
	public void save_and_verify() {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();

	}
}

