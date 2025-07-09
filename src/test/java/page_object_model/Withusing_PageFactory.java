package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Withusing_PageFactory {
	WebDriver driver;

	// constructor
	Withusing_PageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement username;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement submit;

	// action
	public void setUsername(String user) {
		username.sendKeys(user);
	}

	public void setPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clicklogin() {
		submit.click();
	}
}
