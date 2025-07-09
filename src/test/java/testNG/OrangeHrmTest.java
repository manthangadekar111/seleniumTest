package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmTest {
	WebDriver driver;

	@Test(priority = 1)
	public void openapp2() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("application open---");

	}

	@Test(priority = 2)
	public void logotest34() throws InterruptedException {
		Thread.sleep(5000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo is displayed=====>" + status);

	}

	@Test(priority = 3)
	public void testlogin443() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("entering valid credentials");

	}

	@Test(priority = 4)
	public void testlogout998() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("application closed---");
		driver.quit();
	}

}
