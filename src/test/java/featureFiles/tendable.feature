Feature: Main page functionality verification

Background: Browser should launch successfully and user should get navigated to URL.

@Test
Scenario: Confirm accessibility of the top-level menus: Home, Our Story, Our Solution, and Why Tendable.

Given User should be on the Home Page
And Verifies whether the top-Level menus are accessible
Then Close the browser