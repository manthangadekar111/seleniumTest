package types_of_alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Types_of_Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// open alert and close 
//		driver.findElement(By.xpath("//button[contains(text(),'click the button')]")).click();
		// driver.switchTo().alert().accept();

		// open alert and get title
		/*
		 * Alert alert = driver.switchTo().alert(); System.out.println(alert.getText());
		 * alert.accept();
		 */

		// alert with Ok and cancel btn
//		driver.findElement(By.cssSelector("a[href='#CancelTab']")).click(); 

		// confirmation alert
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();

		// prompt alert
		driver.findElement(By.cssSelector("a[href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert d = driver.switchTo().alert();
		d.sendKeys("welcome");
		driver.switchTo().alert().accept();
	}

}
