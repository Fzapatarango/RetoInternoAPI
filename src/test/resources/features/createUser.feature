Feature: create a user in Regres.in
  Me as a user want to create a user

  Scenario: Create a user
    When create a user
      | name    | salary | age |
      | brandon | 1200   | 22  |
    Then I should see the user is created