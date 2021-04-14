package udemydemo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {

	@Test
	  public void WebLogingHomeLoan() {
		  System.out.println("WebLogingCarLoan");
	  }
	  
	  @BeforeTest
	  public void MobileLoginHomeLoan() {
		  System.out.println("MobileLoginCarLoan");
	  }
	  
	  @Test
	  public void LoginAPIHomeLoan()
	  {
		  System.out.println("LoginAPICarLoan");
	  }
}
