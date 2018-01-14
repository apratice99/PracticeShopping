package modules;

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.UpdatePersonalInfoPage;

public class UpdatePersonalinfoAction {
	public static void UpdateFirstName(WebDriver driver, List<HashMap<String, String>> map, String firstName)
			throws Exception {
		WebElement firstnameTextbox = UpdatePersonalInfoPage.firstnameTextbox;
		
		firstnameTextbox.clear();
		firstnameTextbox.sendKeys(firstName);

		UpdatePersonalInfoPage.currentPasswdTextbox.sendKeys(map.get(0).get("password"));
		UpdatePersonalInfoPage.newPasswdTextbox.sendKeys(map.get(0).get("password"));
		UpdatePersonalInfoPage.confirmationPasswdTextbox.sendKeys(map.get(0).get("password"));
		
		UpdatePersonalInfoPage.saveButton.click();
	}

	public static void VerifyFirstLastName(WebDriver driver, List<HashMap<String, String>> map, String expectedfirstLastName)
			throws Exception {
		String actualFirstNameLastName = UpdatePersonalInfoPage.personal_information.getText();
		
		System.out.println(" expectedfirstLastName : " + expectedfirstLastName);
		System.out.println(" actualFirstNameLastName : " + actualFirstNameLastName);
		assertEquals(expectedfirstLastName, actualFirstNameLastName);
	}
}