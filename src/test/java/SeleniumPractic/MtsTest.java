package SeleniumPractic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.MtsHomePage;
import page.PayPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTest extends BaseTest {
    // Задание 1.
    @Test
    @DisplayName("Проверка надписей в незаполненных полях для варианта оплаты услуг:'Услуги связи' в блоке 'Онлайн без комиссии'")
    public void FieldCommunicationServices() {
        MtsHomePage mtsHomePage = new MtsHomePage();
        mtsHomePage.openUrl("https://www.mts.by/");
        mtsHomePage.clickAcceptCookie();
        mtsHomePage.scrollToOnlineReplenishment();
        mtsHomePage.clickSelectorButton();
        mtsHomePage.clickCommunicationServices();
        assertEquals("Номер телефона", mtsHomePage.getPhoneNumberFieldTextComServ(), "В поле должно отображаться 'Номер телефона'");
        assertEquals("Сумма", mtsHomePage.getConnectionSumFieldTextComServ(), "В поле должно отображаться 'Сумма'");
        assertEquals("E-mail для отправки чека", mtsHomePage.getEmailFieldTextComServ(), "В поле должно отображаться 'E-mail для отправки чека'");
    }

    @Test
    @DisplayName("Проверка надписей в незаполненных полях для варианта оплаты услуг:'Домашний интернет' в блоке 'Онлайн без комиссии'")
    public void FieldHomeInternet() {
        MtsHomePage mtsHomePage = new MtsHomePage();
        mtsHomePage.openUrl("https://www.mts.by/");
        mtsHomePage.clickAcceptCookie();
        mtsHomePage.scrollToOnlineReplenishment();
        mtsHomePage.clickSelectorButton();
        mtsHomePage.clickHomeInternet();
        assertEquals("Номер абонента", mtsHomePage.getUserInternetNumber(), "В поле должно отображаться 'Номер абонента");
        assertEquals("Сумма", mtsHomePage.getAmountFieldInternet(), "В поле должно отображаться 'Сумма");
        assertEquals("E-mail для отправки чека", mtsHomePage.getEmailFieldInternet(), "В поле должно отображаться 'E-mail для отправки чека");
    }

    @Test
    @DisplayName("Проверка надписей в незаполненных полях для варианта оплаты услуг:'Рассрочка' в блоке 'Онлайн без комиссии'")
    public void FieldInstallmentPlan() {
        MtsHomePage mtsHomePage = new MtsHomePage();
        mtsHomePage.openUrl("https://www.mts.by/");
        mtsHomePage.clickAcceptCookie();
        mtsHomePage.scrollToOnlineReplenishment();
        mtsHomePage.clickSelectorButton();
        mtsHomePage.clickInstallmentPlanField();
        assertEquals("Номер счета на 44", mtsHomePage.getAccountNumberInstallmentPlanField(), "В поле должно отображаться 'Номер счета на 44");
        assertEquals("Сумма", mtsHomePage.getAmountFieldInstallmentPlan(), "В поле должно отображаться 'Сумма");
        assertEquals("E-mail для отправки чека", mtsHomePage.getEmailFieldInstallmentPlan(), "В поле должно отображаться 'E-mail для отправки чека");
    }

    @Test
    @DisplayName("Проверка надписей в незаполненных полях для варианта оплаты услуг:'Задолженность' в блоке 'Онлайн без комиссии'")
    public void FieldDebt() {
        MtsHomePage mtsHomePage = new MtsHomePage();
        mtsHomePage.openUrl("https://www.mts.by/");
        mtsHomePage.clickAcceptCookie();
        mtsHomePage.scrollToOnlineReplenishment();
        mtsHomePage.clickSelectorButton();
        mtsHomePage.clickDebtField();
        assertEquals("Номер счета на 2073", mtsHomePage.getAccountNumberDebtField(), "В поле должно отображаться 'Номер счета на 2073");
        assertEquals("Сумма", mtsHomePage.getAmountDebtField(), "В поле должно отображаться 'Сумма");
        assertEquals("E-mail для отправки чека", mtsHomePage.getEmailDebtField(), "В поле должно отображаться 'E-mail для отправки чека");
    }

    // Задание 2.
    @Test
    @DisplayName("Проверка формы оплаты для варианта оплаты услуг:'Услуги связи'")
    public void checkPayForm() throws InterruptedException {
        MtsHomePage mtsHomePage = new MtsHomePage();
        PayPage payPage = new PayPage();
        mtsHomePage.openUrl("https://www.mts.by/");
        mtsHomePage.clickAcceptCookie();
        mtsHomePage.scrollToOnlineReplenishment();
        mtsHomePage.clickSelectorButton();
        mtsHomePage.clickCommunicationServices();
        mtsHomePage.numberPhoneInputField();
        mtsHomePage.amountInputField();
        mtsHomePage.clickContinueButton();

        assertTrue(payPage.isAmountPayFieldDisplayed(), "В поле должна отображаться сумма ввода денежных средств");
        assertTrue(payPage.isPayButtonDisplayed(), "В поле должна отображаться 'Оплатить' и сумма ввода денежных средств");
        assertTrue(payPage.isPhoneNumberDisplayed(), "В поле должен отображаться номер телефона пользователя");
        assertTrue(payPage.isNumberCardFieldDisplayed(), "В поле должен отображаться 'Номер карты' пользователя");
        assertTrue(payPage.isValidityCardFieldDisplayed(), "В поле должен отображаться 'Срок действия' карты пользователя");
        assertTrue(payPage.isCardCVCFieldDisplayed(), "В поле должен отображаться 'CVC' карты пользователя");
        assertTrue(payPage.isUserNameCardFieldDisplayed(), "В поле должно отображаться 'Имя держателя (как на карте)'");
        assertTrue(payPage.isLogoMasterCardDisplay(), "Отображение логотипа MasterCard");
        assertTrue(payPage.isLogoVisaDisplay(), "Отображение логотипа 'VISA'");
        assertTrue(payPage.isLogoBelCardDisplay(), "Отображение логотипа Белкарт");
        assertTrue(payPage.isLogoMirDisplay(), "Отображение логотипа 'МИР'");
    }
}