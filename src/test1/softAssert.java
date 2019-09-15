package test1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import test1.sumOf;

public class softAssert {
	@Test
	public void sumnum() {
		
		SoftAssert sa = new SoftAssert();
		System.out.println("\nRunning Test sumnum");
		
		sumOf obj = new sumOf();
		int result = obj.sum(2, 2);
		sa.assertEquals(result, 3);
		System.out.println("Line after first assert");
		
		sa.assertEquals(result, 4);
		System.out.println("Line after second assert");
		
		sa.assertEquals(result, 5);
		System.out.println("line after actual result");
		sa.assertAll();
	}
}
