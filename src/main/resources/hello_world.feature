Feature: Hello World
  Scenario: Print hello world to the console
    Given I have a hello world app
    When I ask it to say hi
    Then it should answer with "Hello World!"