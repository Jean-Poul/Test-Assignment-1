Feature: Convert Arabic to Roman numeral
  The ancient Romans would be proved of these technology

  Scenario Outline: Use should be able to convert arabic numeral to roman numeral
    Given The user provides a valid arabic numeral
    When the convert should take the input (Arabic numeral): <arabic>
    Then the numeral should be converted to (Roman numeral): <numeral>
    Examples:
      | arabic | numeral |
      | 1      | I       |
      | 2      | II      |
      | 3      | III     |
      | 4      | IV      |
      | 5      | V       |
      | 6      | VI      |
      | 7      | VII     |
      | 8      | VIII    |
      | 9      | IX      |
      | 10     | X       |
      | 1000   | M       |
      | 10114  | _XCXIV  |
