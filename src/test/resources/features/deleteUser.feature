Feature: Delete an user
  Me as a user want to delete a user in Reqres.in

  Scenario: Delete a user
    Given deletes a user with id 23
    Then should see the status code is 204