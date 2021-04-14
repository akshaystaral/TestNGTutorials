package udemydemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class myclass {
	
	public String baseURL = "http://demo.guru99.com/test/newtours/";
	String driverPath = "A:\\Chromedriver\\87\\chromedriver.exe";
	public WebDriver driver;
	
	
  @Test
  public void verifyHomePageTitle() {
	  System.out.println("Launching Web Browser");
	  System.setProperty("webdriver.chrome.driver",driverPath);
	  driver = new ChromeDriver();
	  driver.get(baseURL);
	  String expectedPageTitle = "Welcome: Mercury Tours";
	  String actualPageTitle = driver.getTitle();
	  Assert.assertEquals(actualPageTitle, expectedPageTitle);
	  
	  driver.quit();
  }
}
