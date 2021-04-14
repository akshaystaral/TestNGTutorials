package udemydemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {
  
	@Test
	@Parameters({ "val1", "val2" })
	public void Sum(int v1, int v2) {
		int mul = v1 * v2;
		System.out.println("The Final Multiply is:" + mul);
	}
	
	
}
