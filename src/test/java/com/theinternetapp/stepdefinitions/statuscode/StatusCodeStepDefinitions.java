package com.theinternetapp.stepdefinitions.statuscode;

import com.theinternetapp.factory.DriverFactory;
import com.theinternetapp.pagesobjects.actions.navigation.Navigate;
import com.theinternetapp.pagesobjects.actions.statuscode.StatusCode;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.theinternetapp.pagesobjects.actions.PageManager.navigate;
import static com.theinternetapp.pagesobjects.actions.PageManager.statusCode;
import static org.assertj.core.api.Assertions.assertThat;

public class StatusCodeStepDefinitions {

    private WebDriver driver;


    @Before
    public void setUp() {
        driver = DriverFactory.initializeDriver(null);
        navigate = new Navigate(driver);
        statusCode = new StatusCode(driver);
    }


    @After
    public void tearDown() {
        driver.quit();
    }


    @Given("User is on the Status Codes page")
    public void userIsOnTheStatusCodesPage() {
        navigate.toTheStatusCodePage();
    }

    @When("User selects the status code {}")
    public void userSelectsTheStatusCodePage(String statusCodes) {
        statusCode.clickOn(statusCodes);
    }

    @Then("should return a expected response with a message {}")
    public void shouldReturnAExpectedResponseWithAMessageResponse(String message) {
        assertThat(statusCode.getResponseMessage()).contains(message);
    }
}
