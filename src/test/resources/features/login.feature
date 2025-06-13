Feature: Login

  Scenario: Successful login
    Given I am on the login page
    When I enter "clark@example.com" as username and "password" as password
    And I click the login button
    Then I should see a page titled "MyPage"

  Scenario: Incorrect password
    Given I am on the login page
    When I enter "clark@example.com" as username and "incorrect-password" as password
    And I click the login button
    Then I should see "Email or password is invalid." for username
    Then I should see "Email or password is invalid." for password

  Scenario: Empty username
    Given I am on the login page
    When I enter "" as username and "incorrect-password" as password
    And I click the login button
    Then I should see "Please fill out this field." message for the username field

  Scenario: Empty password
    Given I am on the login page
    When I enter "Admin" as username and "" as password
    And I click the login button
    Then I should see "Please fill out this field." message for the password field
