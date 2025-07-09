package types_of_alert;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_box {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//multiple checkboxes
		/*List<WebElement> boxes = driver.findElements(By.xpath("//input[@name='color']"));
		for (int i = 0; i < boxes.size(); i++) {
			boxes.get(i).click();
		}
		*/
		//select last 3 one by one 
		//without loop
//		driver.findElement(By.xpath("//input[@name='color' and @value='purple']")).click();
//		driver.findElement(By.xpath("//input[@name='color' and @value='green']")).click();
//		driver.findElement(By.xpath("//input[@name='color' and @value='orange']")).click();
		
		List<WebElement> b = driver.findElements(By.xpath("//input[@name='color']"));
//		for(int i = b.size()-1; i>2;i--) {
//			b.get(i).click();
//		}
		//start from middle 
		/*for(int i=b.size()-3;i<b.size();i++) {
			b.get(i).click();
		}
		*/
		//click first 3 color
		/*for(int i=0;i<3;i++) {
			b.get(i).click();
		}*/
		
		//click randomly and after some second that clicked option should be inselected
		for(int i=0;i<b.size();i=i+2) {
			b.get(i).click();
		}
		
		Thread.sleep(2000);
		for(int i=b.size()-2;i>=0;i=i-2) {
			b.get(i).click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
