Feature: Weather measurement (celsius to fahrenheit)
  We all want a magic box that can convert these ancient problems

  Scenario Outline: User should be able to convert celsius to fahrenheit
    Given the user provides a valid measurement
    When wanting to view celsius: <celsius> conversion
    Then the user will be shown the conversion in fahrenheit: <fahrenheit>
    Examples:
      | celsius | fahrenheit |
      | 10.0    | 50.0       |
      | 20.0    | 68.0       |
      | 30.0    | 86.0       |
