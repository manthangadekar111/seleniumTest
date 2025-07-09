package testNG;

import org.testng.annotations.*;

public class All_annotation {
	@BeforeSuite
	void beforesuite() {
		System.out.println("this is BeforeSuite");
	}

	@AfterSuite
	void aftersuite() {
		System.out.println("this is AfterSuite");

	}

	@BeforeTest
	void beforetest() {
		System.out.println("this is Beforetest");

	}

	@AfterTest
	void aftertest() {
		System.out.println("this is After Test");

	}

	@BeforeClass
	void beforeclass() {
		System.out.println("this is Beforeclass");

	}

	@AfterClass
	void afterclass() {
		System.out.println("this is after class");

	}

	@BeforeMethod
	void beforemethod() {
		System.out.println("this is Beforemethod");

	}

	@AfterMethod
	void aftermethod() {
		System.out.println("this is after method");

	}

	@Test
	void test1() {
		System.out.println("this is test1");

	}

	@Test
	void test2() {
		System.out.println("this is test2");

	}

}
