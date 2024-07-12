package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
    @FindBy(xpath = "//*[@id='pay-connection']//button[@class='button button__default ']")
    private WebElement continueButton;
    @FindBy(xpath = "//input[@id='connection-email']")
    private WebElement emailField;
    @FindBy(xpath = "//*[@class='select__option'][text()='Домашний интернет']")
    private WebElement homeInternetField;
    @FindBy(xpath = "//input[@id='internet-phone']")
    private WebElement userNumberHomeInternet;
    @FindBy(xpath = "//input[@id='internet-sum']")
    private WebElement amountFieldHomeInternet;
    @FindBy(xpath = "//input[@id='internet-email']")
    private WebElement emailFieldHomeInternet;
    @FindBy(xpath = "//p[text()='Рассрочка']")
    private WebElement installmentPlanField;
    @FindBy(xpath = " //input[@id='score-instalment']")
    private WebElement accountNumberInstallmentPlan;
    @FindBy(xpath = " //input[@id='instalment-sum']")
    private WebElement amountFieldInstallmentPlan;
    @FindBy(xpath = " //input[@id='instalment-email']")
    private WebElement emailFieldInstallmentPlan;
    @FindBy(xpath = "//p[text()='Задолженность']")
    private WebElement debtField;
    @FindBy(xpath = "//input[@id='score-arrears']")
    private WebElement accountNumberDebt;
    @FindBy(xpath = "//input[@id='arrears-sum']")
    private WebElement amountDebtField;
    @FindBy(xpath = "//input[@id='arrears-email']")
    private WebElement emailDebtField;

    @FindBy(xpath = "//iframe[@class='bepaid-iframe']")
    private WebElement frame;


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

    public void clickContinueButton() throws InterruptedException {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        continueButton.click();
        Thread.sleep(3000);
        driver.switchTo().frame(frame);
    }

    public String getPhoneNumberFieldTextComServ() {
        return numberPhoneBtn.getAttribute("placeholder");
    }

    public String getConnectionSumFieldTextComServ() {
        return inputAmount.getAttribute("placeholder");
    }

    public String getEmailFieldTextComServ() {
        return emailField.getAttribute("placeholder");
    }

    public void clickHomeInternet() {
        homeInternetField.click();
    }

    public String getUserInternetNumber() {
        return userNumberHomeInternet.getAttribute("placeholder");
    }

    public String getAmountFieldInternet() {
        return amountFieldHomeInternet.getAttribute("placeholder");
    }

    public String getEmailFieldInternet() {
        return emailFieldHomeInternet.getAttribute("placeholder");
    }

    public void clickInstallmentPlanField() {
        installmentPlanField.click();
    }

    public String getAccountNumberInstallmentPlanField() {
        return accountNumberInstallmentPlan.getAttribute("placeholder");
    }

    public String getAmountFieldInstallmentPlan() {
        return amountFieldInstallmentPlan.getAttribute("placeholder");
    }

    public String getEmailFieldInstallmentPlan() {
        return emailFieldInstallmentPlan.getAttribute("placeholder");
    }

    public void clickDebtField() {
        debtField.click();
    }

    public String getAccountNumberDebtField() {
        return accountNumberDebt.getAttribute("placeholder");
    }

    public String getAmountDebtField() {
        return amountDebtField.getAttribute("placeholder");
    }

    public String getEmailDebtField() {
        return emailDebtField.getAttribute("placeholder");
    }

}
