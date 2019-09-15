package test1;

import org.testng.Assert;
import org.testng.annotations.Test;
import test1.sumOf;

public class testAnnot {
	@Test
	public void sum() {
		System.out.println("\nSum test case running");
		sumOf obj = new sumOf();
		int result = obj.sum(2, 2);
		Assert.assertEquals(result, 4);
		System.out.println("test passed");
	}

	@Test
	public void string() {
		System.out.println("\nString test case running");
		String expectedString = "Nishant Ranjan";
		sumOf obj = new sumOf();
		String result = obj.addString("Nishant", "Ranjan");
		Assert.assertEquals(result, expectedString);
		System.out.println("test passed");
	}

	@Test
	public void array() {
		System.out.println("\nArray test case running");
		int[] expectedArray = { 1, 2, 3, 4 };
		sumOf obj = new sumOf();
		int[] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);
		System.out.println("test passed");
	}
}
