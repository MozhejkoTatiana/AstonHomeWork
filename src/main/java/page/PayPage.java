package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayPage extends BasePage {
    @FindBy(xpath = "//*[@class='pay-description__cost']")
    private WebElement amountPayField;
    @FindBy(xpath = "//*[@class='colored disabled']")
    private WebElement payButton;
    @FindBy(xpath = "//*[@class='pay-description__text']")
    private WebElement phoneNumberText;
    @FindBy(xpath = "//*[@class='ng-tns-c46-1 ng-star-inserted']")
    private WebElement numberCard;
    @FindBy(xpath = "//*[@class='ng-tns-c46-4 ng-star-inserted']")
    private WebElement validityCard;
    @FindBy(xpath = "//*[@class='ng-tns-c46-5 ng-star-inserted']")
    private WebElement cardCVC;
    @FindBy(xpath = "//*[@class='ng-tns-c46-3 ng-star-inserted']")
    private WebElement userNameCard;
    @FindBy(xpath = "//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']")
    private WebElement logoMasterCard;
    @FindBy(xpath = "//img[@src='assets/images/payment-icons/card-types/visa-system.svg']")
    private WebElement logoVisa;
    @FindBy(xpath = "//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']")
    private WebElement logoBelCard;
    @FindBy(xpath = "//*[@class='cards-brands cards-brands_random ng-tns-c61-0 ng-star-inserted']")
    private WebElement logoMirCard;


    public PayPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isAmountPayFieldDisplayed() {
        return amountPayField.isDisplayed();
    }

    public boolean isPayButtonDisplayed() {
        return payButton.isDisplayed();
    }

    public boolean isPhoneNumberDisplayed() {
        return phoneNumberText.isDisplayed();
    }

    public boolean isNumberCardFieldDisplayed() {
        return numberCard.isDisplayed();
    }

    public boolean isValidityCardFieldDisplayed() {
        return validityCard.isDisplayed();
    }

    public boolean isCardCVCFieldDisplayed() {
        return cardCVC.isDisplayed();
    }

    public boolean isUserNameCardFieldDisplayed() {
        return userNameCard.isDisplayed();
    }

    public boolean isLogoMasterCardDisplay() {
        return logoMasterCard.isDisplayed();
    }

    public boolean isLogoVisaDisplay() {
        return logoVisa.isDisplayed();
    }

    public boolean isLogoBelCardDisplay() {
        return logoBelCard.isDisplayed();
    }

    public boolean isLogoMirDisplay() {
        return logoMirCard.isDisplayed();
    }
}
