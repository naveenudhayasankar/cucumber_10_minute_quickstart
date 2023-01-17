Feature: Is it Friday yet?
  Everybody needs to know when it's Friday

  Scenario: Sunday isn't Friday
    Given Today is "Sunday"
    When I ask if it's Friday yet
    Then I should be told "Nope"

    Scenario: Friday is Friday
      Given Today is "Friday"
      When I ask if it's Friday yet
      Then I should be told "TGIF"