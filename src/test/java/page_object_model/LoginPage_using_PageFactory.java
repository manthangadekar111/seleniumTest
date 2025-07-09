package page_object_model;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage_using_PageFactory {
	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test
	void logintest() {
		Without_using_PageFactory lg = new Without_using_PageFactory(driver);
		lg.setUsername("Admin");
		lg.setPassword("admin123");
		lg.clicklogin();

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterClass
	void towndown() {
		driver.quit();
	}
}
