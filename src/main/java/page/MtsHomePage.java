package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MtsHomePage extends BasePage {
    public MtsHomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class='pay__wrapper']//h2")
    private WebElement onlineReplenishmentTitle;
    @FindBy(xpath = "//*[@id='cookie-agree']")
    private WebElement agreeCookieBtn;
    @FindBy(xpath = "//*[@alt='Visa']")
    private WebElement presenceLogoVisa;
    @FindBy(xpath = "//*[@alt='Verified By Visa']")
    private WebElement presenceLogoVerifiedByVisa;
    @FindBy(xpath = "//div[@class='pay__partners']//*[@alt='MasterCard']")
    private WebElement presenceLogoMasterCard;
    @FindBy(xpath = "//*[@alt='MasterCard Secure Code']")
    private WebElement presenceLogoMasterCardSecureCode;
    @FindBy(xpath = "//div[@class='pay__partners']//*[@alt='Белкарт']")
    private WebElement presenceLogoBelCard;
    @FindBy(xpath = "//*[text()='Подробнее о сервисе']")
    private WebElement aboutService;
    @FindBy(xpath = "//*[@class='select__arrow']")
    private WebElement selectorButton;
    @FindBy(xpath = "//*[@class='pay-form opened']")
    private WebElement openForm;
    @FindBy(xpath = "//*[@class='select__option'][text()='Услуги связи']")
    private WebElement communicationServicesButton;
    @FindBy(xpath = "//*[@placeholder='Номер телефона']")
    private WebElement numberPhoneBtn;
    @FindBy(xpath = "//input[@id='connection-sum']")
    private WebElement inputAmount;
    @FindBy(xpath = "//*[@class='button button__default']") //проверить!
    private WebElement continueButton;

    public boolean isOnlineReplenishmentDisplay() {
        return onlineReplenishmentTitle.isDisplayed();
    }

    public void clickAcceptCookie() {
        agreeCookieBtn.click();
    }

    public void scrollToOnlineReplenishment() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", onlineReplenishmentTitle);
    }

    public boolean isPresenceLogoVisaDisplay() {
        return presenceLogoVisa.isDisplayed();
    }

    public boolean isPresenceLogoVerifiedByVisa() {
        return presenceLogoVerifiedByVisa.isDisplayed();
    }

    public boolean isPresenceLogoMasterCard() {
        return presenceLogoMasterCard.isDisplayed();
    }

    public boolean isPresenceLogoMasterCardSecureCode() {
        return presenceLogoMasterCardSecureCode.isDisplayed();
    }

    public boolean isPresenceLogoBelCard() {
        return presenceLogoBelCard.isDisplayed();
    }

    public void clickAboutService() {
        aboutService.click();
    }

    public void clickSelectorButton() {
        selectorButton.click();
    }

    public boolean isOpenFormDisplay() {
        return openForm.isDisplayed();
    }

    public void clickCommunicationServices() {
        communicationServicesButton.click();
    }

    public void numberPhoneInputField() {
        numberPhoneBtn.sendKeys("297777777");
    }

    public void amountInputField() {
        inputAmount.sendKeys("10");
    }

    public void clickContinueButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(continueButton).click().build().perform();
    }
}
