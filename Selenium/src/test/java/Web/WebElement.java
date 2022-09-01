package Web;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElement {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\revat\\eclipse-workspace\\Selenium\\Drivers\\Geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");

		//Web element to search in browser
		try {
			//driver.findElement(By.name("q")).sendKeys("abc");
			//types selenium in textbox
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
			//press enter to search 
			driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.ENTER);
            
        
			//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.nsg-button"))).click()
		}
		catch(Exception e){
			System.out.println(e);
		}
		

		//					or

		//WebElement text=driver.findElement(By.name("q"));
		//text.sendKeys("Revathi");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		driver.close();
		System.out.println("success");
	}
}
