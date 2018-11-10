package TestNg;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testcase1 {
  WebDriver driver;
  @BeforeMethod
  public void launch() {
	  
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.56.5:3001/add.php"); 
	
  }
  @Test
  public void verifywebiste() {
	  System.out.println("Enter User details");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	  driver.findElement(By.xpath("//div[@class='col-sm-4']"));
	  driver.findElement(By.name("login")).sendKeys("cherry1");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.name("password")).sendKeys("cherry1");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.name("click")).click();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
  }
  
//  @AfterMethod
//  public void close() {
//	  driver.close();
//  }
// @AfterMethod
//  public void close() {
//	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	  driver.close();
//	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//  }
}
