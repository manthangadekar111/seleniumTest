package dataProvider;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProvider_demo {
	WebDriver driver;

	@BeforeClass
	void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(dataProvider = "db")
	void login(String username, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);

		boolean titlestore = driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();

		if (titlestore == true) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Assert.assertTrue(true);
			System.out.println("true");
		} else {
			Assert.assertTrue(false);
			System.out.println("false");
		}
	}

	@DataProvider(name = "db", indices = { 0, 1 })
	Object[][] logindata() {
		Object[][] id_pwd = { { "abc@123gmail.com", "abc@123" }, { "xyz@123gmail.com", "xyz@123" },
				{ "mant@123.gmail.com", "mant@123" }, { "manthangandekar111@gmail.com", "Manthan@123" } };
		return id_pwd;
	}

	@AfterClass
	void teardown() {
		driver.quit();
	}
}
