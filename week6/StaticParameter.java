package week6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class StaticParameter {
	@Parameters({"url","username","password","companyName", "description"})
	
	@Test
	public void runstaticparameter(String url,String username, String password, String companyName, String description) throws InterruptedException{
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url); 
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
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
			   driver.findElement(By.xpath("//a[@title='Legal Entities']/following::a[1]")).click();	
			    WebElement element2 = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
			    act.moveToElement(element2).perform();
			    act.click(element2).perform();
			 // elements gathering
			    driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys(companyName);
			    driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(description);
			    WebElement element3 = driver.findElement(By.xpath("//span[text()='--None--']"));
				   act.scrollToElement(element3).perform();
				   act.click(element3).perform();
				   Thread.sleep(5000);
				   
				   WebElement element4 = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]"));
				   act.moveToElement(element4).perform();
				   Thread.sleep(2000);
				   act.click(element4).perform();
			   
			  
			   driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();	
			  //getting text
			   String text = driver.findElement(By.xpath("//h2[text()='We hit a snag.']")).getText();
			   System.out.println(text);
			   String text2 = driver.findElement(By.xpath("//strong[text()='Review the following fields']")).getText();
			   System.out.println(text2);
	
	}
}
