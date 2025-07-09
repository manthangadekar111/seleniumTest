package date_picker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_date {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		String requiredyear = "2020";
		String requiredmonth = "May";
		String requireddate = "3";

		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		// select year
		Thread.sleep(2000);
		WebElement year_dropdown = driver.findElement(By.xpath("//select[@title='Change the year']"));
		Select select = new Select(year_dropdown);
		select.selectByVisibleText(requiredyear);

	}

}
