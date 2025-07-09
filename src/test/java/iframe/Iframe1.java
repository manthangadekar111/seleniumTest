package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		// first xpath with iframe tag
//		WebElement frm = driver.findElement(By.xpath("//Iframe[@id='singleframe']"));
//		driver.switchTo().frame(frm);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Manthan");

		// inner iframe
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement frminner1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frminner1);
		WebElement frminner2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(frminner2);
		Thread.sleep(5);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manthan");
	}

}
