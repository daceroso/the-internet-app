package com.theinternetapp.pagesobjects.actions.statuscode;

import com.theinternetapp.pagesobjects.actions.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StatusCode extends BasePage {


    public static final By PAGE_TITLE = By.xpath("//h3[text()='Status Codes']");
    public static final By STATUS_CODE_LIST = By.xpath("//ul/li/a");

    public StatusCode(WebDriver driver) {
        super(driver);
    }

    public void clickOn(String statusCode) {
        List<WebElement> statusCodes = getElements(STATUS_CODE_LIST);
        statusCodes.stream()
                .filter(code -> code.getText().equals(statusCode))
                .findFirst()
                .ifPresent(WebElement::click);
    }


}
