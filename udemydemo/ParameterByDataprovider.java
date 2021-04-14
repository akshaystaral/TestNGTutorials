package udemydemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterByDataprovider {

	public String baseURL = "https://www.google.com/";
	String driverPath = "A:\\Chromedriver\\87\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.out.println("Launching Web Browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseURL);
	}
	
	 /** Test case to verify google search box
     * @param author
     * @param searchKey
     * @throws InterruptedException
     */
	@Test(dataProvider="SearchProvider", dataProviderClass=DataproviderClass.class)
	public void testMethod(String author, String searchKey) throws InterruptedException {
		 WebElement searchText = driver.findElement(By.name("q"));
	        //search value in google searchbox
	        searchText.sendKeys(searchKey);
	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	        Thread.sleep(3000);
	        String testValue = searchText.getAttribute("value");
	        System.out.println(testValue +"::::"+searchKey);
	        searchText.clear();
	        //Verify if the value in google search box is correct
	        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	       
	}
	
	@DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "Guru99", "India" },
            { "Krishna", "UK" },
            { "Bhupesh", "USA" }
        };

    }

	
}
