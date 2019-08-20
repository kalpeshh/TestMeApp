@ProductScenario
  Feature: End to end scenario for testmeapp
  
  
   Background: do
  Given Navigate to Home page
  And user click on signup 
  When user enter username
  When user enter fname
  When user enter lname
  When user enter password
  When user enter confirm password
  When user enter gender
  When user enter email
  When user enter mob
  When user enter dob
  When user enter address
  When user select security question
  When user clicks on button
  Then user registration is succesfull
  
 
   
    When user enters username and password
    Then user logged in successfully

    

  @AddToCartAndPaymentProcess
  Scenario: Succesfull Checkout
    Given Navigate to All Categories - Electronics and Headphone
    And Add Product to cart
    When click on checkout
    And select bank and credentials
    Then redirected to Thankyou page

  
    