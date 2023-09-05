package PageObjectsModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class imgLists {
	
	public static int imgCount(WebDriver driver) {
		
		WebElement element = driver.findElement(By.xpath("//div[@class=\"example\"]"));
		
		List<WebElement> ele = element.findElements(By.xpath("//img"));
		int count = ele.size();
		System.out.println("count:-"+ count);
		
		
		return count;
	};

}
