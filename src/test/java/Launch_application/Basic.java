package Launch_application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String storestring = driver.getTitle();
		if(storestring.equals("Swag Labs")) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
		driver.quit();
	}

}
