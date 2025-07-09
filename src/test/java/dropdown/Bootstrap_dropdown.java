package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		// first open it and see options.
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		// single option select

		driver.findElement(By.xpath("//a[@href='http://www.learn-automation.com']")).click();
		List<WebElement> option = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		for (int i = 0; i < option.size(); i++) {
			if (option.get(i).equals("JavaScript")) {
				option.get(i).click();
			}
		}
	}

}
