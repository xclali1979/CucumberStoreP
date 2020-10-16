@TEC-103
Feature: Price Calculation




  Scenario: Add to cart 5 orders and verify their total price is calculated correct

    Given launch web browser
    Then sign in with valid username"1liveli@gmail.com" passworrd"12345ab"
    Then navigate to main page
    And  add to cart 5 orders
    Then verify total price


