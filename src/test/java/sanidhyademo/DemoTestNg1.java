package sanidhyademo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNg1 {

	@BeforeSuite
	public void beforSuite() {
		System.out.println("beforsuite annoted method called");
	}

	@BeforeClass
	public void beforClass() {
		System.out.println("beforClass annoted method called");
	}

	@BeforeTest
	public void beforTest() {
		System.out.println("beforTest annoted method called");
	}

	@BeforeMethod
	public void beforeMetod() {
		System.out.println("beforMethod annoted method called");
	}

	@Test
	public void test1() {
		System.out.println("Test1 annoted method called");
	}

	@Test
	public void test2() {
		System.out.println("Test2 annoted method called");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Aftermethod annoted method called");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass annoted method called");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest annoted method called");
	}

	@AfterSuite
	public void afterSuit() {
		System.out.println("AfterSuit annoted method called");
	}

}
