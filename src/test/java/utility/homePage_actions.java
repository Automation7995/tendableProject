package utility;

import org.openqa.selenium.WebDriver;
import utility.*;

import locators.menu_Locators;

public class homePage_actions {
	WebDriver driver;
	config config = new config();
	
	menu_Locators menu_Locators = new menu_Locators();

	public void launchBrowser() {
		driver = config.launchingChromeBrowser();
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
	
	public void closeBrowser()
	{
		config.closeBrowser();
	}

}
