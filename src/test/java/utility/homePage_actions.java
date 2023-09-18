package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public void verifyingRequestDemo()
	{
		Boolean requestADemo = driver.findElement(menu_Locators.ourStory).isDisplayed();
		
		if(requestADemo == true)
		{
			System.out.println("Request A Demo Menu is displayed on the Home Page");
		}
	}
	
	public void verifyingRequestDemoBtnActiveOnAllPages()
	{
		WebElement Element;
		long timeouts = Long.parseLong(config.properties.getProperty("Wait"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeouts));
				
		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.ourStory));
		Element.click();
		
		Boolean requestADemoOnOurStory = driver.findElement(menu_Locators.ourStory).isEnabled();
		
		if(requestADemoOnOurStory == true)
		{
			System.out.println("Request A Demo Menu is active on the Our story page");
		}
		
		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.ourSolution));
		Element.click();
		
		Boolean requestADemoOnOurSolution = driver.findElement(menu_Locators.ourSolution).isEnabled();
		
		if(requestADemoOnOurSolution == true)
		{
			System.out.println("Request A Demo Menu is active on the Our solution page");
		}
		
		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.whyTendable));
		Element.click();
		
		Boolean requestADemoOnWhyTendable = driver.findElement(menu_Locators.ourSolution).isEnabled();
		
		if(requestADemoOnWhyTendable == true)
		{
			System.out.println("Request A Demo Menu is active on the Why Tendable page");
		}
		
	}
	
	public void closeBrowser()
	{
		config.closeBrowser();
	}

}
