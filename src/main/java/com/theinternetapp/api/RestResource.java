package com.theinternetapp.api;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static com.theinternetapp.api.SpecBuilder.getResponseSpec;
import static io.restassured.RestAssured.given;

public class RestResource {

    public static Response get(String path) {
        return given(getRequestSpec()).
                when().get(path).
                then().spec(getResponseSpec()).
                extract().
                response();
    }

    private static RequestSpecification getRequestSpec() {
        return SpecBuilder.getRequestSpec();
    }
}
