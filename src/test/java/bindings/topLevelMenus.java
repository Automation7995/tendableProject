package bindings;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.config;
import utility.homePage_actions;

public class topLevelMenus {
	
	homePage_actions homePage_actions = new homePage_actions();
	config config = new config();
	
  @Given("^User should be on the Home Page$")
  public void navigateTo() throws Throwable {
	  
	  homePage_actions.homePageVerification();
  }

  @When("^Verifies whether the top-Level menus are accessible$")
  public void when() throws Throwable {
	  
	  homePage_actions.verifyingTopLevelMenus();
  }

  @Then("^Close the browser$")
  public void then() throws Throwable {
	  config.closeBrowser();
	  
  }

}
