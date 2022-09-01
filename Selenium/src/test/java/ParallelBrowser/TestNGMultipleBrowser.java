package ParallelBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGMultipleBrowser {
      WebDriver driver=null;
      
      
  	@Parameters("Browser")
	@BeforeTest
	public void setup( @Optional("Chrome")String Browser) {
		if(Browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		
		}
		else if(Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			
		}
		else 
			 System.out.println("No Browser is set");
			
	}
	
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(3000);
		
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Success");
	}
}
