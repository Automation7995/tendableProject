package locators;

import org.openqa.selenium.By;

public class menu_Locators {
	
	public By ourStory = By.linkText("Our Story");
	public By ourSolution = By.linkText("Our Solution");
	public By whyTendable = By.linkText("Why Tendable?");
	
	public By requestADemo = By.linkText("Request a Demo");
	public By contactUs = By.linkText("Contact Us");
	public By marketing = By.xpath("//button[@class='body-button bg-plain-600 toggle-control']");
	
	public By fullName = By.id("form-input-fullName");
	public By organisationName = By.id("form-input-organisationName");
	public By phoneNumber = By.id("form-input-cellPhone");
	public By email = By.id("form-input-email");
	
	public By agreeRadioButton = By.id("form-input-consentAgreed-0");
	public By submitButton = By.cssSelector("#contactMarketingPipedrive-163701 > div:nth-child(18) > div > button");
	
	public By errorMessage = By.xpath("//li[contains(text(),'This field is required')]");
	
}
