Feature: Web login
  Scenario: User should be logged in with valid information
    Given User go to login page
    When User enter valid information
    And User click to submit
    Then User should be logged in to web successfully

  Scenario: User can not log in with invalid information
    Given User go to login page
    When User enter invalid information
    And User click to submit
    Then User can not log in to web successfully

  Scenario: User can add product to cart successfully
    Given User go to homepage
    When User click to buy button to add product to cart
    Then User can add product to cart successfully

  Scenario: User can order successfully
    Given User go to homepage
    When User click to buy button to add product to cart
    And User go to cart page
    And User click to payment
    And User add address
    And User checkout
    Then User can add product to cart successfully



