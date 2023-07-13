package com.theinternetapp.stepdefinitions.login;


import com.theinternetapp.factory.DriverFactory;
import com.theinternetapp.model.customer.Customer;
import com.theinternetapp.model.customer.UserCredentials;
import com.theinternetapp.pagesobjects.actions.authentication.Login;
import com.theinternetapp.pagesobjects.actions.navigation.Navigate;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static com.theinternetapp.pagesobjects.actions.PageManager.login;
import static com.theinternetapp.pagesobjects.actions.PageManager.navigate;
import static com.theinternetapp.utils.constants.errors.Messages.welcome;
import static org.assertj.core.api.Assertions.assertThat;


public class LoginStepDefinitions {

    private WebDriver driver;


    @Before
    public void setUp() {
        driver = DriverFactory.initializeDriver(null);
        navigate = new Navigate(driver);
        login = new Login(driver);
    }


    @After
    public void tearDown() {
        driver.quit();
    }

    @DataTableType
    public UserCredentials userCredentials(Map<String, String> entry) {
        return new UserCredentials(entry.get("username"), entry.get("password"));

    }

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        navigate.toTheLoginPage();
    }

    @When("User provides valid credentials")
    public void userProvidesValidCredentials() {
        performSucceedLogin();
    }

    @Then("should be presented with the success message")
    public void shouldBePresentedWithTheSuccessMessage() {
        assertThat(login.withWelcomeMessage()).isEqualTo(welcome.message);
    }

    @When("User attempts to login with then following credentials:")
    public void userAttemptsToLoginWithThenFollowingCredentials(UserCredentials userCredentials) {
        performInvalidLogin(userCredentials);
    }


    @Then("should be presented with the error message {}")
    public void shouldBePresentedWithTheErrorMessage(String errorMessage) {
        assertThat(login.withErrorMessage()).contains(errorMessage);
    }


    private void performSucceedLogin() {
        Customer customer = Customer.withName("user");
        login.withCredentials(customer.getUsername(), customer.getPassword());
        login.as(String.valueOf(customer));
    }

    private static void performInvalidLogin(UserCredentials userCredentials) {
        login.withCredentials(userCredentials.username(), userCredentials.password());
    }

}



