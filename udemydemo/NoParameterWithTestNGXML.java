	package udemydemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NoParameterWithTestNGXML {
	
	public String baseURL = "https://www.google.com/";
	String driverPath = "A:\\Chromedriver\\87\\chromedriver.exe";
	public WebDriver driver;
	
	
  @Test
  @Parameters({"author","searchKey"})
  public void testNoParameter(@Optional String author,@Optional("Guru99") String searchKey ) throws InterruptedException {

	  
	  System.out.println("Launching Web Browser");
	  System.setProperty("webdriver.chrome.driver",driverPath);
	  driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(baseURL);
	  
	  /* Search text in google search box
	   * 
	   */
      WebElement searchText = driver.findElement(By.name("q"));
      searchText.sendKeys(searchKey);
      
      /*
       * Print your Author and SearchKey
       */
      System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);

      System.out.println("Thread will sleep now"); //Thread will Sleep now
      Thread.sleep(3000);
      
      System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);

      //verifying the value in google search box

      AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));

      driver.quit();
  }
  
  
}
