package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_webpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll down page by pixel number
//		js.executeScript("window.scrollBy(0,3000)", "");

		// scroll the page until element is visible
//		WebElement ele = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);

		// scroll the page till end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		//scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}

}
