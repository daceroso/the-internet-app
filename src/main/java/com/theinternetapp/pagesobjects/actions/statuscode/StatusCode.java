package com.theinternetapp.pagesobjects.actions.statuscode;

import com.theinternetapp.pagesobjects.actions.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode extends BasePage {


    public static final By PAGE_TITLE = By.xpath("//h3[text()='Status Codes']");
    public StatusCode(WebDriver driver) {
        super(driver);
    }
}
