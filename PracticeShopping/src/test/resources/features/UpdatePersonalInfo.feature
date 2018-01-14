@FirstName
Feature: Update my perosnal information
  Scenario: Update first name
 		When I open automationpractice website
    And I sign in
    And I update firstname as "Selenium"
    Then I verify the user displayed name as "Selenium Practice" 