Feature: Login

  Scenario: Successful login
    Given I am on the login page
    When I enter "Admin" as username and "admin123" as password
    And I click the login button
    Then I should see "Dashboard" in the top bar breadcrumb