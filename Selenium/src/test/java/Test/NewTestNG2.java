package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestNG2 {
	WebDriver driver=null;

	@BeforeTest 
	public void setUpTest() {
		driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	}

	@Test
	public void GoogleSearch2() {
		driver.get("https://google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		//press enter to search 
	}

	@Test
	public void GoogleSearch3() {
		driver.get("https://google.com");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.ENTER);		

	}
	
	@AfterTest
	public void tearDownTest() throws InterruptedException {
		//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20000));
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
		System.out.println("Success");
	}
}
