Feature: Login
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table

@Regression
  Scenario: Successful Login with valid credentials
    Given User Launch chrome Browser
    And   User Opens URL "https://admin-demo.nopcommerce.com/login"
    When  User enters email as "admin@yourstore.com" and password as "admin"
    And   Click on Login
    Then  Page Title should be "Dashboard / nopcommerce administration"
    When  User click on Logout Link
    Then  Close the Browser

