Feature: My Page

  Scenario: Login as Clark Evans
    When I login as "clark@example.com" with "password" as password
    Then I should see the email "clark@example.com"
    And  I should see the name "Clark Evans"

  Scenario: Login as Diana Johansson
    When I login as "diana@example.com" with "pass1234" as password
    Then I should see the email "diana@example.com"
    And  I should see the name "Diana Johansson"

