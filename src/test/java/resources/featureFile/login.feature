Feature: Login Test

  As a user I want to login in orangeHRMLive website

  @Smoke @Sanity @Regression
  Scenario: User should able to login successfully with valid credentials
    Given I am on login page
    When I enter user name "Admin" in user name field and password "admin123" in password field
    And I click on login button
    Then I should successfully logged in and navigate to dashboard page successfully with text "Welcome"
