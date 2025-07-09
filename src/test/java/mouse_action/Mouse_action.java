package mouse_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testrigor.com/certification/clicks/");
		driver.manage().window().maximize();

		// mouse over
		WebElement Ai_testing = driver.findElement(By.xpath("//a[text()= 'AI Testing']"));
		WebElement under_AI_Testing = driver
				.findElement(By.xpath("//a[@href='https://testrigor.com/ai-in-software-testing/']"));
		Actions act = new Actions(driver);
//		act.moveToElement(Ai_testing).moveToElement(under_AI_Testing).click().build().perform();
		act.moveToElement(Ai_testing).moveToElement(under_AI_Testing).click().perform();

	}

}
