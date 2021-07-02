Feature: Logout Test

  As a user I want to logout from orangeHRMLive

  Background:I am on dash board page with user name "Admin" and password "admin123"
    Given I am on dash board page with user name "Admin" and password "admin123"

  @Smoke @Sanity @Regression
  Scenario: User should logged out successfully
    When I click on welcome admin link
    And I click on logout button
    Then I should logged out successfully and navigate to main page with text"LOGIN Panel"