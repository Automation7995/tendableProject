package bindings;

import org.openqa.selenium.WebDriver;
import utility.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class topLevelMenus {

	homePage_actions homePage_actions = new homePage_actions();

	@Given("^Browser should launch successfully and user should get navigated to URL.$")
	public void launchBrowser() throws Throwable {
		homePage_actions.launchBrowser();
	}

	@Then("^User is on the Home Page and verify whether the top-Level menus are accessible$")
	public void navigateTo() throws Throwable {
		homePage_actions.verifyingTopLevelMenus();
	}

	@Then("^Close the browser$")
	public void then() throws Throwable {

		homePage_actions.closeBrowser();

	}

}
