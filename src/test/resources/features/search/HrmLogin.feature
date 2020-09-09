Feature: HRM login functionality

   @Test01 @RegressionTest
   Scenario: Validate login with valid username and password
    Given I am on HRMLogin page
    And I enter Admin username and admin123 password
    When I click on login button
    Then Login should be successfull

  @Test02 @RegressionTest
  Scenario: Validate login with valid username and invalid password
    Given I am on HRMLogin page
    And I enter Admin username and admin1234 password
    When I click on login button
    Then Login should be unsuccessfull

  @Test03 @RegressionTest
  Scenario: Validate login with invalid username and valid password
    Given I am on HRMLogin page
    And I enter Admin1 username and admin123 password
    When I click on login button
    Then Login should be unsuccessfull

  @Test04 @RegressionTest
  Scenario: Validate login with wrong username and password
    Given I am on HRMLogin page
    And I enter Admin1 username and admin1234 password
    When I click on login button
    Then Login should be unsuccessfull

  @Test05
  Scenario: Validate user login with empty username
    Given I am on HRMLogin page
    And I enter empty username and admin123 password
    When I click on login button
    Then Login should be successfull

  Scenario: Validate user login with empty password
    Given I am on HRMLogin page
    And I enter Admin username and empty password
    When I click on login button
    Then Login should be successfull

  Scenario: Validate user login with valid username and password
    Given I am on HRMLogin page
    And I enter Admin username and admin123 password
    When I click on login button
    Then Login should be successfull



