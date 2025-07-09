package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.main.Option;

public class Select_dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//select[@id = 'country']"));
		Select dropele = new Select(ele);
		// select option from dropdown
		// dropele.selectByVisibleText("India");
		// select by value
		// dropele.selectByValue("IN");
		// select by index - index start from 1
//		dropele.selectByIndex(1);

		// capture total option in dropdown
		List<WebElement> options = dropele.getOptions();
//		System.out.println("options in dropdown " + options.size());

		// print all options in console.
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i + " = " + options.get(i).getText());

		}

	}

}
