package com.theinternetapp.pagesobjects.actions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BasePage {


    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    protected void navigateTo(String url) {
        driver.navigate().to(url);
    }

    protected void click(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    protected void type(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }

    protected void waitForVisibility(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public List<WebElement> getElements(By locator) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return driver.findElements(locator);
    }

    protected void waitForElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForPageTitle(String title) {
        wait.until(ExpectedConditions.titleIs(title));
    }

    public void waitForPartialPageTitle(String partialTitle) {
        wait.until(ExpectedConditions.titleContains(partialTitle));
    }

    public void waitForTextToBePresentInElement(By locator, String text) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }


    public void takeScreenshot(String filename) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/Screenshots/" + filename + ".png";
        try {
            FileUtils.copyFile(srcFile, new File(destination));
        } catch (IOException e) {
            System.out.println("Error occurred while taking screenshot: " + e.getMessage());
            e.printStackTrace();
        }
    }




}
