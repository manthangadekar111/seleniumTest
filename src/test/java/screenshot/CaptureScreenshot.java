package screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// full page
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
//		File targetfile = new File(System.getProperty("user.dir") + "\\Screenshot\\fullpage.png");
//		sourcefile.renameTo(targetfile);

		// capture specific screenshot - here we are not write a takesScreenshot
		// statement because we want to capture specific screenshot not full page
//		WebElement store_table = driver.findElement(By.xpath("//table[@name='BookTable']"));
//		File sourcefile1 = store_table.getScreenshotAs(OutputType.FILE);
//		File targetfile1 = new File(System.getProperty("user.dir") + "\\Screenshot\\specific.png");
//		sourcefile1.renameTo(targetfile1);

		// capture screenshot of element
		WebElement ele = driver.findElement(By.xpath("//img[@class=\"wikipedia-icon\"]"));
		File sourcefile2 = ele.getScreenshotAs(OutputType.FILE);
		File targetfile2 = new File(System.getProperty("user.dir") + "\\Screenshot\\logo.png");
		sourcefile2.renameTo(targetfile2);

	}

}
