package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * login---@BeforeClass
 * search -- @Test
 * adv search --@Test
 * logout--@AfterClass
 * 
 * 
 * */
public class BeforeClass_AfterrClass {
	@BeforeClass
	public void login334() {
		System.out.println("application login");
	}

	@Test(priority = 1)
	public void search3r4r() {
		System.out.println("product search ");

	}

	@Test(priority = 2)
	public void advancedsearch566() {
		System.out.println("advanced product search ");

	}

	@AfterClass
	public void logout563() {
		System.out.println("application logout");

	}
}
