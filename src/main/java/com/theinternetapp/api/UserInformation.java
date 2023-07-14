package com.theinternetapp.api;

import io.restassured.RestAssured;
import org.junit.Test;

public class UserInformation {

    @Test
    public void shouldDisplayUserInformation() {
        RestAssured.get("https://jsonplaceholder.typicode.com/users")
                .then()
                .statusCode(200)
                .log().all();

    }
}
