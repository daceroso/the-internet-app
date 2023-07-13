package com.theinternetapp.pagesobjects.actions.navigation;

import com.theinternetapp.pagesobjects.actions.BasePage;
import com.theinternetapp.pagesobjects.actions.authentication.Login;
import com.theinternetapp.pagesobjects.actions.statuscode.StatusCode;
import org.openqa.selenium.WebDriver;

import static com.theinternetapp.utils.constants.endpoint.EndPoint.LOGIN;
import static com.theinternetapp.utils.constants.endpoint.EndPoint.STATUS;

public class Navigate extends BasePage {
    public static final String BASE_URL = "http://the-internet.herokuapp.com";

    public Navigate(WebDriver driver) {
        super(driver);
    }

    public Login toTheLoginPage() {
        navigateTo(BASE_URL + LOGIN.url);
        waitForVisibility(Login.USERNAME_FIELD);
        return new Login(driver);
    }

    public StatusCode toTheStatusCodePage() {
        navigateTo(BASE_URL + STATUS.url);
        //waitForVisibility(StatusCode.CODE_200);
        return new StatusCode(driver);
    }
}
