package udemydemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeMethod
	public void WebLogin() {
		System.out.println("WebLogin executed before method");
	}

	@Test(groups= {"Smoke"})
	public void MobileLoging() {
		System.out.println("MobileLoging");
	}
	
	
	@Parameters({ "URL" })
	@Test(groups= {"ParmeTest"})
	public void MobileSignOut(@Optional String urlname) {
		System.out.println("MobileSignOut");
		System.out.println(urlname);
	}

	@Test
	public void MobileLogout() {
		System.out.println("MobileLogout");
	}

	@AfterMethod
	public void APILogin() {
		System.out.println("APILogin executed after method");
	}

}
