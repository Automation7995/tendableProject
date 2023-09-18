package utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;
import locators.menu_Locators;

public class homePage_actions {
	WebDriver driver;

	config config = new config();
	menu_Locators menu_Locators = new menu_Locators();

	public void launchBrowser() {
		driver = config.launchingChromeBrowser();
	}

	public void verifyingTopLevelMenus() {

		try {
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}

	}

	public void verifyingRequestDemo() {
		Boolean requestADemo = driver.findElement(menu_Locators.ourStory).isDisplayed();

		if (requestADemo == true) {
			System.out.println("Request A Demo Menu is displayed on the Home Page");
		}
	}

	public void verifyingRequestDemoBtnActiveOnAllPages() {
		WebElement Element;
		long timeouts = Long.parseLong(config.properties.getProperty("Wait"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));

		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.ourStory));
		Element.click();

		Boolean requestADemoOnOurStory = driver.findElement(menu_Locators.ourStory).isEnabled();

		if (requestADemoOnOurStory == true) {
			System.out.println("Request A Demo Menu is active on the Our story page");
		}

		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.ourSolution));
		Element.click();

		Boolean requestADemoOnOurSolution = driver.findElement(menu_Locators.ourSolution).isEnabled();

		if (requestADemoOnOurSolution == true) {
			System.out.println("Request A Demo Menu is active on the Our solution page");
		}

		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.whyTendable));
		Element.click();

		Boolean requestADemoOnWhyTendable = driver.findElement(menu_Locators.ourSolution).isEnabled();

		if (requestADemoOnWhyTendable == true) {
			System.out.println("Request A Demo Menu is active on the Why Tendable page");
		}

	}

	public void clickOnContactUs() {
		WebElement Element;
		long timeouts = Long.parseLong(config.properties.getProperty("Wait"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));

		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.contactUs));
		Element.click();
	}

	public void clickOnMarketingTab() {
		WebElement Element;
		long timeouts = Long.parseLong(config.properties.getProperty("Wait"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));

		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.marketing));
		Element.click();

	}

	public void fillForm() throws InterruptedException {
		WebElement Element;
		long timeouts = Long.parseLong(config.properties.getProperty("Wait"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));

		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.fullName));
		Element.click();
		Element.sendKeys(config.properties.getProperty("name"));
		Thread.sleep(1000);

		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.organisationName));
		Element.click();
		Element.sendKeys(config.properties.getProperty("organizationName"));
		Thread.sleep(1000);

		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.phoneNumber));
		Element.click();
		Element.sendKeys(config.properties.getProperty("phoneNumber"));
		Thread.sleep(1000);

		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.email));
		Element.click();
		Element.sendKeys(config.properties.getProperty("email"));
		Thread.sleep(1000);

		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.agreeRadioButton));
		Element.click();
		Thread.sleep(1000);

		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Locators.submitButton));
		Element.click();
	}

	public void verifyErrorMessage() throws InterruptedException {

		WebElement errorMessageElement = driver.findElement(menu_Locators.errorMessage); // Adjust the locator as needed

		// Assert that the error message element is displayed
		Assert.assertTrue("Error message is not displayed", errorMessageElement.isDisplayed());
	}

	public void closeBrowser() {
		config.closeBrowser();
	}

}
