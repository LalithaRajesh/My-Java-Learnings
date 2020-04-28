Feature: Java program to perform all arithmetic operations

  Scenario: Perform addition operation on two numbers
    Given Create an addition Operation
    When I add two integer numbers
    Then The result is a integer addition

  Scenario: Play FizzBuzz to get Bizz
    Given Create a FizzBuzz game play
    When I play with number 5
    Then The result is "BUZZ"

  Scenario: Play FizzBuzz to get Bizz
    Given Create a FizzBuzz game play
    When I play with number 2
    Then The result is "INVALID"