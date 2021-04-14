package udemydemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest1 {

	@Test(priority=1)
	@Parameters({ "val1", "val2" })
	public void Sum(int v1, int v2) {
		int finalsum = v1 + v2;
		System.out.println("The Final Sum is:" + finalsum);
	}

	@Test(priority=2)
	@Parameters({ "val1", "val2" })
	public void Diff(int v1, int v2) {
		int finaldiff = v1 - v2;
		System.out.println("The Final Difference is:" + finaldiff);
	}

}
