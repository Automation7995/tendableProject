Feature: Main page functionality verification

@Test
Scenario: Confirm accessibility of the top-level menus: Home, Our Story, Our Solution, and Why Tendable.

Given Browser should launch successfully and user should get navigated to URL.
Then User is on the Home Page and verify whether the top-Level menus are accessible
Then Close the browser