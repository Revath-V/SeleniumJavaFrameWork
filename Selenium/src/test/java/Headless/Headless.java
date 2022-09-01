package Headless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Headless {
	@Test
	public void test() {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1366,768");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");
		System.out.println(driver.getTitle());
	}
}