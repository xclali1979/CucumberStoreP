@TEC-102
Feature: Validating My Address Functionality




  Scenario: Go to your account and update your address and verify it is updated (Datatable)
  User Story
    Given launch web browser
    Then sign in with valid username"1liveli@gmail.com" passworrd"12345ab"
    Then update your address
      | adres         | adres2 | city       | state | zip   | country | info | hphone     | cphone     | assign        |
      |1225 basswood | way    | chicago | 13    | 60173 | 1       | info | 4242342345 | 4242342342 | 2513 basswood |

    And verify it is updated


