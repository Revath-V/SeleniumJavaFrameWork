package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class Searchobject {
WebDriver driver=null;
By textBox=By.xpath("//input[@name='q']");
By searchbutton=By.xpath("(//input[@name='btnK'])[2]") ;


public Searchobject(WebDriver driver) {
	this.driver=driver;
}

public void SetTextInSearchBox(String text) {
	driver.findElement(textBox).sendKeys(text);
}

public void Search() {
	driver.findElement(searchbutton).sendKeys(Keys.ENTER);
}
}