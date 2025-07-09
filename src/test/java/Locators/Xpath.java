package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// single attribute
//		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("phone");
//		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();

		// multiple attribute
//		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox'][@placeholder='Search Amazon.in']")).sendKeys("tshirt");
//		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();

//		 and & or with xpath
//		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' and @placeholder='Search Amazon.in' ]"))
//				.sendKeys("t-shirt");
//		driver.findElement(By.xpath("//*[@id='nav-search-submit-button' or @type='submit1']")).click();
		// text() function with xpath
//		driver.findElement(By.xpath("//*[text()='Hello, sign in']")).click();

		// contains() function using Xpath
//		driver.findElement(By.xpath("//input[contains(@id,'twotab')]")).sendKeys("t-shirt");

		// start-with function using xpath
//		driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]")).sendKeys("t-shirt");
//		driver.findElement(By.xpath("//input[starts-with (@id,'nav-search')]")).click();
	
	
	}

}
