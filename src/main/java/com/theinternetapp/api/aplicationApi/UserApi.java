package com.theinternetapp.api.aplicationApi;

import com.theinternetapp.api.RestResource;
import com.theinternetapp.api.Route;
import io.restassured.response.Response;

public class UserApi {

    public static Response getUsers() {
        return RestResource.get(Route.USERS);
    }
}
