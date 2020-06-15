# new feature
# Tags: optional
@login
Feature: login feature

  Scenario: user can login with credentials
    Given user is at the home page
    When user login as a "driver"
    Then user should be able to see the dashboard page