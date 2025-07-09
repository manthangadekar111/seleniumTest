package mouse_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://qa-practice.netlify.app/double-click");
		driver.manage().window().maximize();
		WebElement dbl = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		// dbl click on btn
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.doubleClick(dbl).build().perform();
	}

}
