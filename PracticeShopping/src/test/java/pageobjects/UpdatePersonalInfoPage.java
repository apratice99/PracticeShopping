package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UpdatePersonalInfoPage extends BaseClass {

	public UpdatePersonalInfoPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='firstname']")
	public static WebElement firstnameTextbox;

	@FindBy(how = How.ID, using = "old_passwd")
	public static WebElement currentPasswdTextbox;
	
	@FindBy(how = How.ID, using = "passwd")
	public static WebElement newPasswdTextbox;

	@FindBy(how = How.ID, using = "confirmation")
	public static WebElement confirmationPasswdTextbox;

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	public static WebElement saveButton;

	@FindBy(how = How.XPATH, using = "//a[@title='View my customer account']")
	public static WebElement personal_information;
}
