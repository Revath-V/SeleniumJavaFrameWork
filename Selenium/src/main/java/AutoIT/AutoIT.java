package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
    driver.findElement(By.linkText("Select PDF file")).click();
    Runtime.getRuntime().exec("W:\\fileupload.exe");
    
    Thread.sleep(3000);
    driver.close();
	System.out.println(driver.getTitle());
}
}
