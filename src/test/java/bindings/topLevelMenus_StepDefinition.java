package bindings;

import utility.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class topLevelMenus_StepDefinition {

	homePage_actions homePage_actions = new homePage_actions();

	@Given("^Browser should launch successfully and user should get navigated to URL.$")
	public void launchBrowser() throws Throwable {
		homePage_actions.launchBrowser();
	}

	@Given("^User is navigated to the Home Page and verify whether the top-Level menus are accessible$")
	public void checkAccessibility() throws Throwable {
		homePage_actions.verifyingTopLevelMenus();
	}

	@Given("^User is navigated to the Home Page and verify that the 'Request a Demo' button is present.$")
	public void requestDemoPresent() throws Throwable {
		homePage_actions.verifyingRequestDemo();
	}
	
	@And("^The 'Request a Demo' button is active on each of the aforementioned 'Our Story, Our Solution, and Why Tendable' top-level menu pages$")
	public void requestDemoActive() throws Throwable {
		homePage_actions.verifyingRequestDemoBtnActiveOnAllPages();
	}
	
	@Then("^Close the browser$")
	public void then() throws Throwable {

		homePage_actions.closeBrowser();

	}

}
