package broken_link;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_link_demo {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		//all link under anchor tag
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		int noOfBrokenink=0;
		for (WebElement linkelements : links) {
			String hrefattvalue = linkelements.getAttribute("href");
			if (hrefattvalue == null || hrefattvalue.isEmpty()) {
				System.out.println("not possible to check..");
			}
			try {
				// convert into URl
				URL linkurl = new URL(hrefattvalue);
				HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();
				conn.connect();// connect to server and sent request to the server.
				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefattvalue + "=====>broken link..");
					noOfBrokenink++;
				} else {
					System.out.println(hrefattvalue + "=====>not broken link..");
				}
			} catch (Exception e) {

			}
		}
		System.out.println("number of broken link present here "+noOfBrokenink);

	}

}
