Feature: Search by keyword

  Scenario: Searching for a term
    Given I am on the DuckDuckGo home page
    When I search for "cucumber"
    Then all the result titles should contain the word "cucumber"