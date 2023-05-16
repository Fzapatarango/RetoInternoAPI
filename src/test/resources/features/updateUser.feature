Feature: Update user
  Me as a user want to update an user in Reqres.in

  Scenario: Update user
    Given I update the user with id
      | id | name    | salary | age |
      | 21 | brandon | 1200   | 22  |
    Then should see the status code is 200
    And see the response body
