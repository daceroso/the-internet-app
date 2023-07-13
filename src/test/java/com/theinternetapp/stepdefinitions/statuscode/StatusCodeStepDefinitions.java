package com.theinternetapp.stepdefinitions.statuscode;

import com.theinternetapp.pagesobjects.actions.navigation.Navigate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StatusCodeStepDefinitions {
    WebDriver driver;
    private Navigate navigate;

    @Given("User is on the Status Codes page")
    public void userIsOnTheStatusCodesPage() {
        navigate.toTheLoginPage();
    }
    @When("User selects the {int} status code page")
    public void userSelectsTheStatusCodePage(Integer int1) {

    }

    @Then("should return a response <Expected Response> with a status code <Status Code>")
    public void shouldReturnAResponseExpectedResponseWithAStatusCodeStatusCode() {
    }
}
