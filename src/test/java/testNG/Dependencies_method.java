package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencies_method {
	@Test(priority = 1)
	public void openapp1() {
		System.out.println("application open");
		Assert.assertTrue(false);

	}

	@Test(priority = 2, dependsOnMethods = { "openapp1" })
	public void login2() {
		System.out.println("application login");
		Assert.assertTrue(true);
	}

	@Test(priority = 3, dependsOnMethods = { "login2" })
	public void search() {
		System.out.println("application search ");
		Assert.assertTrue(true);
	}

	@Test(priority = 4, dependsOnMethods = { "login2" })
	public void advsearch() {
		System.out.println("application adv search ");
		Assert.assertTrue(true);
	}

	@Test(priority = 5, dependsOnMethods = { "login2" })
	public void logout3() {
		System.out.println("application logout");
		Assert.assertTrue(true);
	}
}
