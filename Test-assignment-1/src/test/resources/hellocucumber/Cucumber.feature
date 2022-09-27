Feature: the version can be retrieved

  Scenario: client makes call to GET /version
    When the client calls /version
    Then the client receives status code of 200
    And the client receives server version 1.0


Feature: Checkout

  Scenario Outline: Checkout thing
    Given something "<argument>" yes
    When yo "<something>"
    Then total <total>

    Examples:

      | argument | something | total |
      | 40       | 1         | 40    |
      | 40       | 2         | 80    |
      | 20       | 1         | 20    |
      | 20       | 3         | 60    |
      | 10       | 5         | 50    |