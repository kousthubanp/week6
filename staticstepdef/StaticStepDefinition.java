package staticstepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StaticStepDefinition {
	public ChromeDriver driver;
	@Given("Launching Browser")
	public void launching_browser() {
	   driver= new ChromeDriver();
	}

	@When("load the salesforce url")
	public void load_the_salesforce_url() {
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("enter in the username as dilip@testleaf.com")
	public void enter_in_the_username_as_dilip_testleaf_com() {
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	}

	@When("enter in the password as leaf@{int}")
	public void enter_in_the_password_as_leaf(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
	}

	@When("click on the login")
	public void click_on_the_login() {
		driver.findElement(By.id("Login")).click();
	}

	@When("Click the App Launcher Icon next to Setup")
	public void click_the_app_launcher_icon_next_to_setup() {
		driver.findElement(By.xpath("//div[@class='slds-r8']/following-sibling::div[1]")).click();
	}

	@When("Select Accounts")
	public void select_accounts() {
		Actions act= new Actions(driver);
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		WebElement element = driver.findElement(By.xpath("//p[text()='Accounts']"));
		act.scrollToElement(element).perform();
		act.click(element).perform();
	}

	@When("Search for the account using your unique account name.")
	public void search_for_the_account_using_your_unique_account_name() {
		driver.findElement(By.xpath("//label[text()='Search this list...']/following::input")).sendKeys("kousthu");
		driver.findElement(By.linkText("kousthu")).click();

	}

	@When("Click the dropdown icon next to the account and select Edit.")
	public void click_the_dropdown_icon_next_to_the_account_and_select_edit() {
		driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button_icon-border-filled')]//lightning-primitive-icon")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();

	}

	@When("Set Type to Technology Partner.")
	public void set_type_to_technology_partner() throws InterruptedException {
		Actions act= new Actions(driver);
		WebElement element2 = driver.findElement(By.xpath("(//span[text()='--None--'])[2]"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element2);
		act.click(element2).perform();
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Technology Partner']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element3);
		act.click(element3).perform();
		Thread.sleep(2000);

	}

	@When("Set Industry to Healthcare.")
	public void set_industry_to_healthcare() {
		Actions act= new Actions(driver);
		WebElement element4 = driver.findElement(By.xpath("//label[text()='Industry']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element4);
		act.click(element4).perform();
		
		WebElement element5 = driver.findElement(By.xpath("//span[@title='Healthcare']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element5);
		act.click(element5).perform();
	}

	@When("Enter the Billing Address {string}")
	public void enter_the_billing_address(String BillingAddress) {
		driver.findElement(By.xpath("//label[text()='Billing Street']/following::textarea")).sendKeys(BillingAddress);
	}

	@When("Enter the Shipping Address {string}")
	public void enter_the_shipping_address(String ShippingAddress) {
		driver.findElement(By.xpath("//label[text()='Shipping Street']/following::textarea")).sendKeys(ShippingAddress);
	}

	@When("Set Customer Priority to Low.")
	public void set_customer_priority_to_low() {
		Actions act= new Actions(driver);
		WebElement element6 = driver.findElement(By.xpath("//label[text()='Customer Priority']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element6);
		act.click(element6).perform();
		WebElement element7 = driver.findElement(By.xpath("//span[text()='Low']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element7);
		act.click(element7).perform();
	}

	@When("Set SLA to Silver.")
	public void set_sla_to_silver() {
		Actions act= new Actions(driver);
		WebElement element8 = driver.findElement(By.xpath("//label[text()='SLA']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element8);
		act.click(element8).perform();
		WebElement element9 = driver.findElement(By.xpath("//span[text()='Silver']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element9);
		act.click(element9).perform();
	}

	@When("Set Active to NO.")
	public void set_active_to_no() {
		Actions act= new Actions(driver);
		WebElement element10 = driver.findElement(By.xpath("//label[text()='Active']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element10);
		act.click(element10).perform();
		WebElement element13 = driver.findElement(By.xpath("(//span[text()='No'])[1]"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element13);
		act.click(element13).perform();
	}

	@When("Enter a unique number in the Phone field {string}")
	public void enter_a_unique_number_in_the_phone_field(String PhoneNumber) {
		Actions act= new Actions(driver);
		WebElement element11 = driver.findElement(By.xpath("//label[text()='Phone']/following::input"));
		act.scrollToElement(element11).perform();
		element11.sendKeys(PhoneNumber);
	}

	@When("Set Upsell Opportunity to No.")
	public void set_upsell_opportunity_to_no() {
		Actions act= new Actions(driver);
		WebElement element12 = driver.findElement(By.xpath("//label[text()='Upsell Opportunity']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element12);
		act.click(element12).perform();
		WebElement element14 = driver.findElement(By.xpath("(//lightning-base-combobox-item[@data-value='No']//span)[2]"));
		driver.executeScript("arguments[0].scrollIntoView(true);", element14);
		act.click(element14).perform();
	}

	@Then("Click Save and verify the phone number")
	public void click_save_and_verify_the_phone_number() {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}
}
