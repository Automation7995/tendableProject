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