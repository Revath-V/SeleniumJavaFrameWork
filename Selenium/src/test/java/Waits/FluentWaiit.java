package Waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWaiit {
	
	@Test
  public void test() throws InterruptedException {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");
		//press enter to search 
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.linkText("Automation World: Home")).click();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 2 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30L))
		       .pollingEvery(Duration.ofSeconds(2L))
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		      WebElement linkelement=driver.findElement(By.xpath("//div[3]/div/div/div/div/a/h3"));
		      
		      	if(linkelement.isEnabled()) 
		      		System.out.println("Element Found");
		      		
		      	return linkelement ;
		     }
		   });
        element.click();
		Thread.sleep(5000);
		driver.close();
  }
}
