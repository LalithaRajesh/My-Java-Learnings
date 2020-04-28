Feature: FizzBuzz Game play

  Scenario: Play FizzBuzz to get Fizz
  //if the number is divisible by 3, return FIZZ
    Given Create a FizzBuzz game play
    When I play with number 3
    Then The result is "FIZZ"

  Scenario: Play FizzBuzz to get Bizz
    Given Create a FizzBuzz game play
    When I play with number 5
    Then The result is "BUZZ"

  Scenario: Play FizzBuzz to get Bizz
    Given Create a FizzBuzz game play
    When I play with number 2
    Then The result is "INVALID"