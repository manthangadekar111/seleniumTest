package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_table {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://qavalidation.com/demo-table/");
		driver.manage().window().maximize();
		// no of row in single table
		int rows = driver.findElements(By.xpath("//table[@id='table01']//tr")).size();
		System.out.println("no of rows" + rows);

		// no of column
		int cols = driver.findElements(By.xpath("//table[@id='table01']//th")).size();
		System.out.println("no of cols" + cols);

		// read data from specific row and column- ex.[2nd row 1st column]
		String getdata = driver.findElement(By.xpath("//table[@id='table01']//tr[2]//td[2]")).getText();
		System.out.println("get specific rows and cols data" + getdata);

//		for (int i = 1; i < rows; i++) {
//			for (int j = 1; j <= cols; j++) {
//				String value = driver.findElement(By.xpath("//table[@id='table01']//tr[" + i + "]//td[" + j + "]"))
//						.getText();
//				System.out.print(value + "\t");
//			}
//			System.out.println();
//		}

		for (int r = 1; r < rows; r++) {
			String automation = driver.findElement(By.xpath("//table[@id='table01']//tr[" + r + "]//td[3]")).getText();
			if (automation.equals("Selenium")) {
				String Manualtesting = driver.findElement(By.xpath("//table[@id='table01']//tr[" + r + "]//td[2]"))
						.getText();
				System.out.println("Manualtesting " + Manualtesting);
			}

		}

	}

}
