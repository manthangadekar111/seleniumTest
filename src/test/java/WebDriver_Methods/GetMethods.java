package WebDriver_Methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//if packages not import then enter ctrl + shift + O
public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//implicite methods
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		// get
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// getTitle
		String gettitle = driver.getTitle();
		System.out.println("gettitle " + gettitle);
		// getcurrentURL
		String geturl = driver.getCurrentUrl();
		System.out.println("getCurrentUrl" + geturl);

		// getPageSource
		String page = driver.getPageSource();
		System.out.println("getPageSource" + page);

		// getWindowHand
		String handle = driver.getWindowHandle();
		System.out.println("getWindowHandle" + handle);

		// getWindowHandles
		driver.findElement(By.partialLinkText("Orange")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println("getWindowHandle" + handles);

	}

}
