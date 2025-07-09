package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// tag + id combination
		// driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("iphone
		// 16");
		// driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();

		// tag+ class
		// driver.findElement(By.cssSelector("span.hm-icon-label")).click();

		// tag + attribute
		// driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys("iphone
		// 16");
		// driver.findElement(By.cssSelector("input[placeholder='Search
		// Amazon.in']")).sendKeys("iphone 16");
		// driver.findElement(By.cssSelector("input[type='submit']")).click();

		// tag + class + attribute
		driver.findElement(By.cssSelector("input.nav-input.nav-progressive-attribute[placeholder='Search Amazon.in']"))
				.sendKeys("t-shirt");
		driver.findElement(By.cssSelector("input.nav-input.nav-progressive-attribute[type='submit']")).click();

	}

}
