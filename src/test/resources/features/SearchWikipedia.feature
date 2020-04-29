@Web
Feature: Search Wikipedia

  Scenario: Search article about Apple on Wikipedia
    Given User open wikipedia homepage
    When User input search "Apple" on homepage
    And User click button search on homepage
    Then User see article with title "Apple" on article page