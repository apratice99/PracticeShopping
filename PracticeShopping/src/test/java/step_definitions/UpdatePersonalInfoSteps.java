package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import modules.UpdatePersonalinfoAction;
import pageobjects.AutomationHomePage;
import pageobjects.MyAccountPage;
import pageobjects.UpdatePersonalInfoPage;

public class UpdatePersonalInfoSteps {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public UpdatePersonalInfoSteps() {
		driver = Hooks.driver;
		datamap = DataHelper.data();
	}

	@When("^I update firstname as \"(.*?)\"$")
	public void iUpdateFirstNameAs(String firstName) throws Throwable {
		PageFactory.initElements(driver, MyAccountPage.class);
		AutomationHomePage.personal_information.click();
		MyAccountPage.myPersonalInformation.click();

		// Thread.sleep(5000);
		PageFactory.initElements(driver, UpdatePersonalInfoPage.class);
		UpdatePersonalinfoAction.UpdateFirstName(driver, datamap, firstName);
	}
	
	@Then("^I verify the user displayed name as \"(.*?)\"$")
	public void i_verify_the_user_displayed_name_as(String firstLastName) throws Throwable {
		PageFactory.initElements(driver, UpdatePersonalInfoSteps.class);
		
		UpdatePersonalinfoAction.VerifyFirstLastName(driver, datamap, firstLastName);
	}
}
