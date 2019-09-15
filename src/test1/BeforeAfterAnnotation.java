package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BeforeAfterAnnotation {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This run once before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("\nThis run once after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("\nRun before method");
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("Run after method");
	}
	
	@Test
	public void testcase1() {
		
		System.out.println("Method 1 is running");
	}

	@Test
	public void testcase2() {
		
		System.out.println("Method 2 is running");
	}

}
