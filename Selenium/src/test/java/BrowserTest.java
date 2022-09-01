import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) {
		
	/*System.setProperty("webdriver.gecko.driver","C:\\Users\\revat\\eclipse-workspace\\Selenium\\Drivers\\Geckodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://google.com");*/
		//	System.setProperty("webdriver.chrome.driver","C:\\Users\\revat\\eclipse-workspace\\Selenium\\Drivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	



		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		driver.close();
	}
}
