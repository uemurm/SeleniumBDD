Feature: Job

  Scenario: Create a job title
    Given I have logged in
    And I am on "Admin" / "Job" | "Job Titles" page
    When I click Add
    And I enter "Software Engineer III" as Job Title
    And I click Save
    Then I should see "Software Engineer III" in the list