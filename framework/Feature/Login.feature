
@tag
Feature: Login Functionality

  @tag1
  Scenario: Successful login with valid credential
    Given User launch chrome browser
   
    When User open Url "https://admin-demo.nopcommerce.com/login"
    And user enter email as "admin@yourstore.com"
    And password as "admin"
    And Click on login button
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on logout link
    Then Page Title should be "Your store. login"
    And close browser

 
