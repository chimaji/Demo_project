package sanidhyademo;

//import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_AnnotationDemo {
	@BeforeSuite
	public void beforesuitemethod() {
		System.out.println("before suite");
	}

	@AfterSuite
	public void aftersuitemethod() {
		System.out.println("after suite");
	}

	@org.testng.annotations.BeforeClass
	public void beforeclassmethod() {
		System.out.println("before class method");
	}

	@AfterClass
	public void afterclassmethod() {
		System.out.println("after class method");
	}

	@BeforeMethod
	public void beforetestmethod() {
		System.out.println("before testmethod");
	}

	@AfterMethod
	public void aftertestmethod() {
		System.out.println(" after test method");
	}

	@Test
	public void test1() {
		System.out.println("test 1 method");
	}

	@Test
	public void test2() {
		System.out.println("test 2 method");
	}
	@BeforeTest
	public void befortestmethod() {
		System.out.println("before test ");
	}


	@AfterTest
	public void aftertest() {
		System.out.println("after test ");
	}
}
