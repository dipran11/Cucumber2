Feature: Login

  Scenario: Login with valid user
    Given open the url Website soucedemo
    And user input Username with "standard_user"
    Then user input Password with "secret_sauce"
    Then user click LOGIN button
    Then user will redirect to homepage

  Scenario: Test Login with Username and Password is blank
    Given open the url "Website_souce_demo"
    And Username blank
    Then user click LOGIN button
    Then there is message error "Epic sadface: Username is required'
