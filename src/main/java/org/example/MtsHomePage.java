package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MtsHomePage {
   /* WebDriver driver;
    WebDriverWait wait;
    public MtsHomePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @FindBy(xpath = "//div[@class='pay__wrapper']//h2")
    private WebElement onlineReplenishmentTitle;

    public boolean isOnlineReplenishmentDisplay() {
      return onlineReplenishmentTitle.isDisplayed();
    }
    public void scrollToOnlineReplenishment(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",onlineReplenishmentTitle);
    }*/
}
