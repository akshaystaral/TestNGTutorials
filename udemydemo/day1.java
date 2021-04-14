package udemydemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite Executed");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite Executed");
	}
	
  @Test(groups= {"Smoke"})
  public void SmokeTest1() {
	  System.out.println("Smoke Test");
  }
  
  @Test
  public void test()
  {
	  System.out.println("Aksahy");
  }
  
  public class TestBeforeClass
  {
	  @BeforeClass
	  public void testBeforeClass(){
		  System.out.println("Before Class Executed");
	  }
	  
	  public void testExample()
	  {
		  System.out.println("Executed Test Example");
	  }
	  
	  @AfterClass
	  public void testAfterClass() {
		  System.out.println("After Class Executed");
	  }
  }
}
