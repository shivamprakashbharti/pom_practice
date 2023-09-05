package PageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
	public static WebElement brokenImg(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//a[text()=\"Broken Images\"]"));
		return element;
	}
	

}
