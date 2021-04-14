package udemydemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class B2bLogin {

	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "A://Chromedriver//88//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qab2biz.ccavenue.com/merchantportal/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void MerchantPortal() {

		WebElement emailId = driver.findElement(By.cssSelector("input[formcontrolname='userName']"));
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));

		emailId.sendKeys("Interceptor@gmail.com");
		password.sendKeys("Pass@1234");
		submit.click();
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='das-msg-content']")));
	}

	@Test
	public void manageVendors() {
		WebElement managevendors = driver.findElement(By.cssSelector("a[menu-label='Manage Vendors']"));
		managevendors.click();
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Vendor01A")));

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
