package com.theinternetapp.api.aplicationApi;

import com.theinternetapp.api.RestResource;
import com.theinternetapp.api.Route;
import com.theinternetapp.api.pojo.User;
import io.restassured.response.Response;

import java.util.Arrays;
import java.util.List;

public class UserApi {



    public static User getUser(String userName) {
        Response response = RestResource.get(Route.USERS + "/" + userName);
        return response.as(User.class);
    }

    public List<User> getAllUsers() {
        Response response = RestResource.get(Route.USERS);
        return Arrays.asList(response.as(User[].class));
    }

}
