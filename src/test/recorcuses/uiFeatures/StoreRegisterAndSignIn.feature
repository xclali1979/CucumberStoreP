@TEC-101
Feature: Authentication functionality

  Background:
    Given launch web browser


  Scenario: Create an account verify it is created by signing in (Use Datatable)
  Then create and account
    | email             | name | lastname | password | day | month | year | company | adres         | adres2 | city       | state | zip    | country | info | hphone     | cphone     | assign        |
    | 2liveli@gmail.com | hagi | sami     | 12345ab  | 5   | 1     | 1985 | concept | 1360 basswood | Rd     | Schaumburg | 13    | 60173 | 1       | info | 4242342345 | 4242342342 | 2513 basswood |
     And verify it is created



  Scenario: Sign in with valid credentials
    Then sign in with valid username"2liveli@gmail.com" passworrd"12345ab"
    And verify sign in page





  Scenario: Sign in with invalid credentials
  Then sign in with ivalid username"liveli@gmail.com" passworrd"2345ab"
  And verify it is not sign in.