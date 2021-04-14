package udemydemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	/* Following method takes one method
	 * 
	 */
	
  @Parameters({ "suite-param" })
  @Test
  public void prameterTestOne(String param) {
	  System.out.println("Test one suite parma is: " + param);
  }
  
  /*
   * Following method takes one parameter as input. Value of the
   * said parameter is defined at test level.
   */
  @Parameters({"test-two-param"})
  @Test
  public void parameterTestTwo(String param) {
	  System.out.println("Test two param i: " + param);
  }
  
  /*
   * Following method takes two parameter as input. Value of the
   * test parameter is defined at test level. The suite level parameter
   * is overridden at the test level
   */
  @Parameters({"suite-param","test-three-param"})
  public void paramTestThree(String param, String paramtwo) {
	  System.out.println("Test three suite param is: " + param);
	  System.out.println("Test three param is: " + param);
  }
  
}

	