package PageObjectsModel;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class upload {
	
	public static void toUpload(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//a[text()=\"File Upload\"]"));
		element.click();
		
		//Click to upload
		WebElement element2 = driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		element2.sendKeys("C:\\Users\\shiva\\OneDrive\\Desktop\\pic.jpg");
		//Click to upload for submission.
		WebElement ele3 = driver.findElement(By.id("file-submit"));
		ele3.click();
		
		Thread.sleep(3000);
	}

}
