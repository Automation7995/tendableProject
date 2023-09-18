Feature: Main page functionality verification

Background:
	Given Browser should launch successfully and user should get navigated to URL.

@Test
Scenario: Confirm accessibility of the top-level menus: Home, Our Story, Our Solution, and Why Tendable.

	Given User is navigated to the Home Page and verify whether the top-Level menus are accessible
	Then Close the browser


@Test
Scenario: Verify that the 'Request a Demo' button is present and active on each of the aforementioned top-level menu pages.

	Given User is navigated to the Home Page and verify that the 'Request a Demo' button is present.
	And The 'Request a Demo' button is active on each of the aforementioned 'Our Story, Our Solution, and Why Tendable' top-level menu pages
	Then Close the browser
	
@Test
Scenario: Navigate to the "Contact Us" section, choose "Marketing", and complete the form—excluding the "Message" field. On submission, an error should arise. Ensure your script confirms the error message's appearance. If the error is displayed, mark the test as PASS. If absent, it's a FAIL.

	Given User is navigated to the Home Page and navigate to Contact Us page.
	Then Clicks on Marketing tab
	And Complete the form- excluding the 'Message' field
	And Ensure the error message
	Then Close the browser
