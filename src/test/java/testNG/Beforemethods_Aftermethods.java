package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * login
 * search
 * logout
 * login 
 * adv search
 * logout
 * 
 * */

public class Beforemethods_Aftermethods {

	@BeforeMethod
	public void login90() {
		System.out.println("login to application");
	}

	@Test(priority = 1)
	public void search100() {
		System.out.println("search the product");
	}

	@Test(priority = 2)
	public void advancedsearch101() {
		System.out.println("advanced search the product");
	}

	@AfterMethod
	public void logout1215() {
		System.out.println("logout application");
	}
}
