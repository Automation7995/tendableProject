package utility;

import locators.menu_Locators;

public class homePage_actions extends config {

	menu_Locators menu_Locators = new menu_Locators();

	public void homePageVerification() {

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals(properties.getProperty("URL"))) {
			System.out.println("User is on Home Page");
		} else {
			System.out.println("User is not on Home Page");
		}

	}

	public void verifyingTopLevelMenus() {
		Boolean ourStoryEnable = driver.findElement(menu_Locators.ourStory).isEnabled();

		if (ourStoryEnable == true) {
			System.out.println("Our Story menu is accessible");
		}

		Boolean ourSolutionEnable = driver.findElement(menu_Locators.ourSolution).isEnabled();

		if (ourSolutionEnable == true) {
			System.out.println("Our Solution menu is accessible");
		}

		Boolean whyTendableEnable = driver.findElement(menu_Locators.whyTendable).isEnabled();

		if (whyTendableEnable == true) {
			System.out.println("Why Tendable? menu is accessible");
		}

	}

}
