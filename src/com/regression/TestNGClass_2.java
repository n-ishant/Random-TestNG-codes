package com.regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseSuite;

public class TestNGClass_2 extends BaseSuite{

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

		System.out.println("TestnG Class_2 is running --> Method 2 is running");
	}
}
