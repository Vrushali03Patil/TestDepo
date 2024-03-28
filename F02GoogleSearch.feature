Feature: Google search fuctionality

  Scenario: Test google search
    Given Open google
    When enter virat kohali in search box
    And hit enter
    Then Search virat kohali should display
