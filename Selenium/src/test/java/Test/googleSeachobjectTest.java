package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.Searchobject;

public class googleSeachobjectTest {

	private static WebDriver driver =null;

	public static void main(String[] args) {
        googleSearchTest();
	}
	public static void googleSearchTest() {
		driver=new FirefoxDriver();
		
		Searchobject obj=new Searchobject(driver);
		driver.get("https://google.com");
		
		
		obj.SetTextInSearchBox("Selenium");
		obj.Search();
	}
}
