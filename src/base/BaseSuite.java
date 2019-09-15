package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseSuite {

	@BeforeClass
	public void beforeClass() {
		System.out.println("\nBase class is running --> This run once before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("\nBase class is running --> This run once after class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("\nBase class is running --> This run once before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("\nBase class is running --> This run once after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("\nBase Suite is running --> This run once before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("\nBase Suite is running --> This run once after Suite");
	}

}
