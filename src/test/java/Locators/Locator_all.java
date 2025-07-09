package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_all {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		// enter some then u can use sendkeys
		// by name
		// driver.findElement(By.name("newsletter")).sendKeys("manthangadekar111@gmail.com");
		// logo display or not
		// boolean store = driver.findElement(By.id("fb-root")).isDisplayed();
		// System.out.println(store);

		// linktext
		// driver.findElement(By.linkText("BLOG")).click();

		// partiallinktext
		//driver.findElement(By.partialLinkText("BLO")).click();

//		List<WebElement> headerlink = driver.findElements(By.className("nav"));
//		System.out.println(headerlink.size());
		
		  List<WebElement> anchorlink = driver.findElements(By.tagName("a"));
		System.out.println("total number of link"+anchorlink.size());
		
		
	}
}
