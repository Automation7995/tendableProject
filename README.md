The project is written in Java language and the framework used is cucumber. 

To execute the code you can directly execute the tendable.feature file as Cucumber Feature.

Architecture is in such a way that Feature file, Step definition, Actions class, Locator class are all bifurcated. 

The data like :  browser to be used, max timeout limit, Url etc is in the configuration.properties file under the config package.

Feature file(tendable.feature) annotations are glued to the step definition file (topLevelMenus_StepDefinition) which has methods of homePage_actions. 

homePage_actions has all the test steps written as per the test scenarios given.

There is no webdriver downloaded for this project as I have used webdriverManager dependency that itself provides the chromeDriver or geckoDriver or IE driver.

Further the issue has been reported and the bug report is attached to the project.

