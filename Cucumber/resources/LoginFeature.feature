Feature: Login Functionality

  @Login
  Scenario Outline: Login with valid credentials
    Given Navigate to Home page
    When user enters "<username>" and "<password>"
    Then user logged in successfully

    Examples: 
      | username | password |
      | Admin    | password456|
      | Lalitha  | password123|

  @data-driven
  Scenario: The one where user picks different product through search functionality
    When Lalitha searches below products in the search box
      | Head   |
      | Travel |
      | Laptop |
    Then product should be added in the cart if available
