Feature: Research things on the web

  Scenario: Researching a thing
    Given Sergey is on the DuckDuckGo home page
    When he searches for "Duck"
    Then all the result titles should contain the word "Duck"
