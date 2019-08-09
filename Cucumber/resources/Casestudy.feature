
Feature: Casestudy


  @register
  Scenario: Registration
  Given Navigate to home page
  When user click on signup button
  When user enter username as "abc1"
  When user enter firstname as "test"
  When user enter lastname as "case"
  When user enter password as "password123"
  When user enter confirm password as "password123"
  When user enter gender as "male"
  When user enter email as "abc@gmail.com"
  When user enter mobile number as "1234567890"
  When user enter DOB as "1/10/1234"
  When user enter address as "909 bhgdwfdyu"
  And user select security question as "What is your favour color?" and user selects seurity answer as "Red"
  And user click on register button
  Then user registration is successfull

@Case4
Scenario Outline: Login with valid credentials
    Given Navigate to Home page
    When user enters "<username>" and "<password>"
    Then user logged in successfully

    Examples: 
      | username | password |
    
      | Lalitha  | password123|


  Scenario: The one where user picks different product through search functionality
    When Lalitha searches below products in the search box
      | Head   |
      | Travel |
      | Laptop |
    Then product should be added in the cart if available


