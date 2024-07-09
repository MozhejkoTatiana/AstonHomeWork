package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoreAboutServicePage extends BasePage {
    @FindBy(xpath = "//*[contains(text(),'Оплата банковской картой')]")
    private WebElement paymentByBankCardTitle;

    public MoreAboutServicePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isPaymentByBankCardDisplay() {
        return paymentByBankCardTitle.isDisplayed();
    }

}

