package com.theinternetapp.stepdefinitions.userverification;

import com.theinternetapp.api.RestResource;
import com.theinternetapp.api.aplicationApi.UserApi;
import com.theinternetapp.api.pojo.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;

import java.util.List;
import java.util.Optional;

public class UserVerificationStepDefinitions {

    private UserApi userApi;
    private List<User> users;
    private User currentUser;

    @Given("JSON Placeholder API is accessible")
    public void jsonPlaceholderAPIIsAccessible() {
        try {
            RestResource.get("/");
        } catch (Exception e) {
            Assertions.fail("API is not accessible", e);
        }
    }

    @Given("User {string} is registered in the system")
    public void userIsRegisteredInTheSystem(String userName) {
//        userApi = new UserApi();
//        Optional<User> userOptional = userApi.getUserByName(userName);
//        Assertions.assertThat(userOptional).isPresent().withFailMessage("User not found");
//        currentUser = userOptional.get();
    }

    @When("User fetches the details for the user {string}")
    public void userFetchesTheDetailsForTheUser(String string, io.cucumber.datatable.DataTable dataTable) {


        ;
    }

    @Then("should return an existence of the user {string} information")
    public void shouldReturnAnExistenceOfTheUser(String string) {

    }
}
