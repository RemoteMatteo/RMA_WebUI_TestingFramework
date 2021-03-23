Feature: Magenta HomePage

  Scenario: Verification of the cookie acceptance
    Given Open Magenta Homepage
    And Maximize browser window
    When Accept pop-up informing about cookies
    Then Magenta Homepage is opened

  Scenario: Verification of the cookie rejection
    Given Open Magenta Homepage
    And Maximize browser window
    When Reject pop-up informing about cookies
    Then Magenta Homepage is not opened