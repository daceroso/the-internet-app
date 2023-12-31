package com.theinternetapp.pagesobjects.actions;

import com.theinternetapp.pagesobjects.actions.authentication.Login;
import com.theinternetapp.pagesobjects.actions.navigation.Navigate;
import com.theinternetapp.pagesobjects.actions.statuscode.StatusCode;
import org.openqa.selenium.WebDriver;

public class PageManager {

    public static Login login;
    public static Navigate navigate;

    public static StatusCode statusCode;



    public static Login getLogin(WebDriver driver) {
        return login == null ? login = new Login(driver) : login;
    }

    public static Navigate getNavigate(WebDriver driver) {
        return navigate == null ? navigate = new Navigate(driver) : navigate;
    }

    public static StatusCode getStatusCode(WebDriver driver) {
        return statusCode == null ? statusCode = new StatusCode(driver) : statusCode;
    }
}
