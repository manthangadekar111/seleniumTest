package date_picker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_date_picker {
//select future date

	static void selectFuture_monthYear(WebDriver driver, String month, String year, String date)
			throws InterruptedException {
		while (true) {
			String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (current_month.equals(month) && current_year.equals(year)) {
				Thread.sleep(5000);

				List<WebElement> savedate = driver
						.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
				for (WebElement dates : savedate) {
					if (dates.getText().equals(date)) {
						dates.click();
						return;
					}
				}
			} else {
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
//				Thread.sleep(2000);
			}
		}
	}

	static void selectpast_monthYear(WebDriver driver, String month, String year, String date)
			throws InterruptedException {
		while (true) {
			String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (current_month.equals(month) && current_year.equals(year)) {
				Thread.sleep(2000);
				List<WebElement> savedate = driver
						.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
				for (WebElement dates : savedate) {
					if (dates.getText().equals(date)) {
						dates.click();
						return;
					}

				}

			} else {
				
				driver.findElement(By.xpath("//a[@data-handler='prev']")).click();// prev
				

			}

		}

	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize();
		// select iframe
		WebElement ele = driver.findElement(By.xpath("//Iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // first click on date picker

		selectFuture_monthYear(driver, "August", "2026", "25");
//		selectpast_monthYear(driver, "March", "2024", "2");
	}

}
