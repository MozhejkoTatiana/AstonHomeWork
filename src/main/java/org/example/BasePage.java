package org.example;


import org.openqa.selenium.WebDriver;

public class BasePage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public void openUrl(String url) {
        driver.get(url);
    }

}