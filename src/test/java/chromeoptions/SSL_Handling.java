package chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL_Handling {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//if u wan to hire : chrome is being controlled by automated test software.
//		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
//		driver.get("https://expired.badssl.com/");
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());

	}

}
