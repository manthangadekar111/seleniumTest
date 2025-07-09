package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Dynamic_pagination_table {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
		driver.manage().window().maximize();
		while (true) {
			// Get and print rows from current page
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
			for (WebElement row : rows) {
				System.out.println(row.getText());
			}

			// Get the pagination info (e.g., Showing 4 to 6 of 10 entries)
			WebElement info = driver.findElement(By.id("example_info"));
			String summary = info.getText();
			System.out.println("Current Page Info: " + summary);

			// Stop if last page
			if (summary.contains("10 to 10 of 10 entries")
					|| summary.contains("of 10 entries") && summary.contains("Next")
							&& !driver.findElement(By.xpath("//a[contains(text(),'Next')]")).isEnabled()) {
				break;
			}

			// Click Next
			WebElement next = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
			next.click();

		}
	}

}
