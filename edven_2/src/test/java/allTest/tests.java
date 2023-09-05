package allTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import PageObjectsModel.*;

public class tests {
	private WebDriver driver;
	
	@BeforeClass
	public void setup() {
		//setup chrome driver manager
		WebDriverManager.chromedriver().setup();
		
		//Intialize chrome
		 driver = new ChromeDriver();
		
		 
	};
	@Test(priority=0,enabled=false)
	public void testing1() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Home.brokenImg(driver).click();
		
		//Count the numbers of img present
		imgLists.imgCount(driver);
		
		
		
	};
	@Test(priority=1,enabled=true)
	public void testing2() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/");
		
		upload.toUpload(driver);
		//for handle alert
		//driver.switchTo().alert().accept();
		
	}

}
