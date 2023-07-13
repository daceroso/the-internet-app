package com.theinternetapp.pagesobjects.actions.authentication;

import com.theinternetapp.model.customer.Customer;
import com.theinternetapp.pagesobjects.actions.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Optional;

public class Login extends BasePage {

    public static final By USERNAME_FIELD = By.id("username");
    public static final By PASSWORD_FIELD = By.id("password");
    public static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");
    public static final By WELCOME_MESSAGE = By.cssSelector("h4.subheader");
    public static final By ERROR_MESSAGE = By.id("flash-messages");

    public Login(WebDriver driver) {
        super(driver);
    }

    public void withCredentials(String username, String password) {
        type(USERNAME_FIELD, Optional.ofNullable(username).orElse(""));
        type(PASSWORD_FIELD, Optional.ofNullable(password).orElse(""));
        click(LOGIN_BUTTON);
    }

    public void as(String customerName) {
        Customer customer = Customer.withName(customerName);
        Cookie authenticationCookie = new Cookie("session-username", customer.getUsername());
        driver.manage().addCookie(authenticationCookie);
        driver.navigate().refresh();
    }

    public String withWelcomeMessage() {
        waitForVisibility(WELCOME_MESSAGE);
        return getText(WELCOME_MESSAGE);
    }

    public String withErrorMessage() {
        waitForVisibility(ERROR_MESSAGE);
        return getText(ERROR_MESSAGE);
    }
}

