package week6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameter {
	@DataProvider(name="fetchdata")
	public String [][] senddata() {
		String[][] data= new String[2][1];
		data [0][0]= "Salesforce Automation by kousthu";
		
		data [1][0]= "Salseforce Automation by kousthuban";
		return data;
	}
	
@Test(dataProvider="fetchdata")
	public void rundynamicparameter(String Name)throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
		driver.findElement(By.id("Login")).click();

		driver.findElement(By.xpath("//div[@class='slds-r8']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		Thread.sleep(5000);
		// action class processing
		Actions act= new Actions(driver);
	WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	act.scrollToElement(element).perform();
	act.click(element).perform();		
	Thread.sleep(3000);
	// elements gathering
	   driver.findElement(By.xpath("//a[@title='Legal Entities']/following::a[1]")).click();	
	    WebElement element2 = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
	    act.moveToElement(element2).perform();
	    act.click(element2).perform();
	    
	    driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(Name);
	    driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	    String text = driver.findElement(By.xpath("//lightning-formatted-text[@data-output-element-id='output-field']")).getText();
	   System.out.println(text);

	}

}
