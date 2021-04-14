package udemydemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public String baseURL = "https://www.geeksforgeeks.org/";
	String driverPath = "A:\\Chromedriver\\87\\chromedriver.exe";
	public WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Launching Web Browser");
	  System.setProperty("webdriver.chrome.driver",driverPath);
	  driver = new ChromeDriver();
	  driver.get(baseURL);
  }

  
  @Test
  public void getTextExample() {
	  
	String currentURL =  driver.getCurrentUrl();
	System.out.println("Your Current URL is : " +currentURL);
	String currentTitle = driver.getTitle();
	System.out.println("Your page title Is : "+currentTitle);

  }
  
  @Test(dependsOnMethods = { "getTextExample" })
  public void printTextExample()
  {
	  driver.findElement(By.xpath("//ul[@id='hslider']//a[normalize-space()='Data Structures']")).click();
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
