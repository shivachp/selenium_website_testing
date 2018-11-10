package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase2 {
	WebDriver driver;
	  @BeforeMethod
	  public void launch() {
		  
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://192.168.56.5:3001");
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	  }
	  @Test
	  public void verifylogin() {
		  System.out.println("Enter User details to login");
		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		  driver.findElement(By.xpath("//div[@class='col-sm-4']"));
		  driver.findElement(By.name("login")).sendKeys("cherry1");
		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		  driver.findElement(By.name("password")).sendKeys("cherry1");
		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		  driver.findElement(By.name("click")).click();
		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		  
	  }
//	  @AfterMethod
//	  public void close() {
//		  driver.close();
//		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		  driver.manage().deleteAllCookies();
//		  driver.close();
//	  }
	  
}
