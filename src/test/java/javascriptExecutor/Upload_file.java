package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// single file
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(3000);
//		ele.sendKeys("C:\\Users\\lenovo\\Desktop\\Codemind\\ManualTester_2.7+Ex.pdf");

		// multiple file upload
		String file1 = "C:\\Users\\lenovo\\Desktop\\Codemind\\Manual & Automation Testing Syllabus.pdf";
		String file2 = "C:\\Users\\lenovo\\Desktop\\Codemind\\ManualTester_2.7+Ex.pdf";
		driver.findElement(By.xpath("//input[@id='multipleFilesInput']")).sendKeys(file1 + "\n" + file2);

	}

}
