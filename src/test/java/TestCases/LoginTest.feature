Feature: Login Test Feature
  @login
  Scenario: Login Test Feature
    Given User Navigates To Zero Bank
    When User Enters Login as "username"
    And User Enters Password as "password"
    And User Clicks Sing In Button
    Then User Should Into To Zero Bank Home Page