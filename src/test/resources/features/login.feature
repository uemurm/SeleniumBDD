Feature: Login

  Scenario: Successful login
    Given I am on the login page
    When I enter "clark@example.com" as username and "password" as password
    And I click the login button
    Then I should see a page titled "MyPage"

#  Scenario: Incorrect password
#    Given I am on the login page
#    When I enter "Admin" as username and "incorrect-password" as password
#    And I click the login button
#    Then I should see "Invalid credentials" in the error message
#
#  Scenario: Empty username
#    Given I am on the login page
#    When I enter "" as username and "incorrect-password" as password
#    And I click the login button
#    Then I should see "Required" message for the username field
#
#  Scenario: Empty password
#    Given I am on the login page
#    When I enter "Admin" as username and "" as password
#    And I click the login button
#    Then I should see "Required" message for the password field
