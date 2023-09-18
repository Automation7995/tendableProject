package methods;

import utility.homePage_actions;

public class homePage_methods {
	
	homePage_actions homePage_actions = new homePage_actions();
	
	public void homePageVerification() {
	
		homePage_actions.verifyHomePage();
	}

	public void menuButtonVerification() {
		
		homePage_actions.verifyingTopLevelMenus();
	}
}
