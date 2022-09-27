Feature: Weather measurement (fahrenheit to celsius)
  We all want a magic box that can convert these ancient problems

  Scenario Outline: User should be able to convert fahrenheit to celsius
    Given the user provides a valid weather measurement
    When user wants to view fahrenheit: <fahrenheit>
    Then the user will be shown the result in celsius: <celsius>
    Examples:
      | fahrenheit | celsius |
      | 50.0       | 10.0    |
      | 68.0       | 20.0    |
      | 86.0       | 30.0    |