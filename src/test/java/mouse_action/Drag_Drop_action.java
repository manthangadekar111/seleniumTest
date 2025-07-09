package mouse_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_action {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		WebElement frm = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frm);

		// drag and drop action
		WebElement image1 = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		act.dragAndDrop(image1, trash).build().perform();
		
		
		//reverse
		WebElement imageInTrash = driver.findElement(By.xpath("//div[@id='trash']//img[@src='images/high_tatras_min.jpg']"));
        WebElement gallery = driver.findElement(By.id("gallery"));
        act.dragAndDrop(imageInTrash, gallery).build().perform();

        Thread.sleep(2000); 
        driver.quit();
	}
}
