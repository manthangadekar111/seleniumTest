package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Without_using_PageFactory {
	WebDriver driver;

	// constructor
	Without_using_PageFactory(WebDriver driver) {
		this.driver = driver;
	}

	// locator
	By username = By.xpath("//input[@name=\"username\"]");
	By password = By.xpath("//input[@name=\"password\"]");
	By loginbtn = By.xpath("//button[@type=\"submit\"]");

	// action
	public void setUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}

	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void clicklogin() {
		driver.findElement(loginbtn).click();
	}

}
