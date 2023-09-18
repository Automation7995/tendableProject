package locators;

import org.openqa.selenium.By;

public class menu_Locators {
	
	public By ourStory = By.linkText("Our Story");
	public By ourSolution = By.linkText("Our Solution");
	public By whyTendable = By.linkText("Why Tendable?");
	
	public By requestADemo = By.linkText("Request a Demo");
	public By contactUs = By.linkText("Contact Us");
	public By marketing = By.linkText("Contact");
	
	public By fullName = By.id("form-input-fullName");
	public By organisationName = By.id("form-input-organisationName");
	public By phoneNumber = By.id("form-input-cellPhone");
	public By email = By.id("form-input-email");
	
	public By agreeRadioButton = By.id("form-input-consentAgreed-0");
	public By submitButton = By.className("button");
	
	public By errorMessage = By.xpath("//li[contains(text(),'This field is required')]");
	
}
