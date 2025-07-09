package date_picker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_pickers {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize();

		// select frame
		WebElement ele = driver.findElement(By.xpath("//Iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(ele);

		// using sentKey()
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/01/2025");

		// using date picker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // first click on date picker
		String year = "2025";
		String month = "April";
//		String day = "3";
		while (true) {
			String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
			if (current_month.equals(month) && current_year.equals(year)) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[text()='3']")).click();
				break;
				
			} else {
				Thread.sleep(1000);
//				driver.findElement(By.xpath("//a[@data-handler='next']")).click();//next
				driver.findElement(By.xpath("//a[@data-handler='prev']")).click();// prev
				
			}

		}

	}

}
