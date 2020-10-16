
Feature: LEAVE COUNTING DAYS
  @TECH-1001
  Scenario: Verify leave and counting days
    Given launc the webpge
    Then input  Username "Admin"  Password"admin123" and login
    And  click the leave page
    Then click the date and calculate duration and v