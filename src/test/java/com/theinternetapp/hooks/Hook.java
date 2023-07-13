package com.theinternetapp.hooks;

import com.theinternetapp.factory.DriverFactory;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    protected WebDriver driver;


    @Before
    public void setUp() {
        String defaultBrowser = "chrome";
        String browser = System.getProperty("browser", defaultBrowser);
        driver = DriverFactory.initializeDriver(browser);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
