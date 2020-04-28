package com.company;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;



public class FizzBuzzStepdefs {

    FizzBuzzProgram fizzBuzz;
    String result;

    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() {
        fizzBuzz = new FizzBuzzProgram();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int number) {
        result = fizzBuzz.play(number);
    }

//    @Then("^The result is Fizz$")
//    public void theResultIsFizz() {
//        Assert.assertEquals(result,"Fizz");
//    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String resultString) {
        Assert.assertEquals(resultString, result);
    }

    @Then("^The result should Fail$")
    public void theResultShouldFail(String resultString) {
        Assert.assertEquals(resultString, result);

    }
}
