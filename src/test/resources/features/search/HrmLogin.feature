Feature: HRM login functionality
  In this feature file we are testing login functionality for OrangeHRM application
    with different combinations of Username and password

   @Test01 @LoginTests
   Scenario: Validate user login with valid username and password
    Given I am on HRMLogin page
    And I enter Admin username and admin123 password
    When I click on login button
    Then Login should be successfull

  @Test02 @LoginTests
  Scenario: Validate user login with valid username and invalid password
    Given I am on HRMLogin page
    And I enter Admin username and admin1234 password
    When I click on login button
    Then Login is unsuccessfull because of InvalidCredentials

  @Test03 @LoginTests
  Scenario: Validate user login with invalid username and valid password
    Given I am on HRMLogin page
    And I enter Admin1 username and admin123 password
    When I click on login button
    Then Login is unsuccessfull because of InvalidCredentials

  @Test04 @LoginTests
  Scenario: Validate user login with wrong username and password
    Given I am on HRMLogin page
    And I enter Admin1 username and admin1234 password
    When I click on login button
    Then Login is unsuccessfull because of InvalidCredentials

  @Test05 @LoginTests
  Scenario: Validate user login with empty username
    Given I am on HRMLogin page
    And I enter blank username and admin123 password
    When I click on login button
    Then Login is unsuccessfull because of BlankUsername

  @Test06 @LoginTests
  Scenario: Validate user login with empty password
    Given I am on HRMLogin page
    And I enter Admin username and blank password
    When I click on login button
    Then Login is unsuccessfull because of BlankPassword

  @Test07 @LoginTests
  Scenario: Validate user login with blank username and blank password
    Given I am on HRMLogin page
    And I enter blank username and blank password
    When I click on login button
    Then Login is unsuccessfull because of BlankUsername



