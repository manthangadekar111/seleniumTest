package testNG;

import org.testng.annotations.Test;

/*
1)open apps
2)login
3)logout
*/

public class FirstTestcase {
	@Test(priority = 1)
	public void openapp111() {
		System.out.println("application open");

	}

	@Test(priority = 223)
	public void login2() {
		System.out.println("application login");
	}

	@Test(priority = 333)
	public void logout3() {
		System.out.println("application logout");
	}
}
