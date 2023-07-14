package com.theinternetapp.stepdefinitions.userverification;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserVerificationStepDefinitions {

    @Given("JSON Placeholder API is accessible")
    public void jsonPlaceholderAPIIsAccessible() {

    }

    @Given("User {string} is registered in the system")
    public void userIsRegisteredInTheSystem(String string) {

    }

    @When("User fetches the details for the user {string}")
    public void userFetchesTheDetailsForTheUser(String string, io.cucumber.datatable.DataTable dataTable) {
        ;
    }

    @Then("should return an existence of the user {string} information")
    public void shouldReturnAnExistenceOfTheUser(String string) {

    }
}
