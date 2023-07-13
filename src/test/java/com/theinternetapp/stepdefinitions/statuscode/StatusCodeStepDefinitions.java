package com.theinternetapp.stepdefinitions.statuscode;

import com.theinternetapp.factory.DriverFactory;
import com.theinternetapp.pagesobjects.actions.authentication.Login;
import com.theinternetapp.pagesobjects.actions.navigation.Navigate;
import com.theinternetapp.utils.config.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.theinternetapp.pagesobjects.actions.PageManager.login;
import static com.theinternetapp.pagesobjects.actions.PageManager.navigate;

public class StatusCodeStepDefinitions {

    private WebDriver driver;


    @Before
    public void setUp() {
        String defaultBrowser = ConfigReader.get("default.browser");
        String browser = System.getProperty("browser", defaultBrowser);
        driver = DriverFactory.initializeDriver(browser);
        navigate = new Navigate(driver);
        login = new Login(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    @Given("User is on the Status Codes page")
    public void userIsOnTheStatusCodesPage() {
        navigate.toTheStatusCodePage();
    }

    @When("User selects the {int} status code page")
    public void userSelectsTheStatusCodePage(Integer int1) {

    }

    @Then("should return a expected response with a message {}")
    public void shouldReturnAExpectedResponseWithAMessageResponse(String message) {
    }
}
