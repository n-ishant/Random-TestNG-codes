package test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass_2 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("TestnG Class_2 is running --> This run once before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("\nTestnG Class_2 is running --> This run once after class");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("\nTestnG Class_2 is running --> Run before method");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("TestnG Class_2 is running --> Run after method");
	}

	@Test
	public void testcase1() {

		System.out.println("TestnG Class_2 is running --> Method 1 is running");
	}

	@Test
	public void testcase2() {

		System.out.println("TestnG Class_ is running --> Method 2 is running");
	}
}
