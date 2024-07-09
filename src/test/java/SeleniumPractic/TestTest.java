package SeleniumPractic;

import org.example.MoreAboutServicePage;
import org.example.MtsHomePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTest extends BaseTest {
    //Задание 1
    @Test
    @DisplayName("Проверка названия блока 'Онлайн без комиссии'")
    public void openPage() {
        MtsHomePage mtsHomePage = new MtsHomePage();
        mtsHomePage.openUrl("https://www.mts.by/");
        mtsHomePage.clickAcceptCookie();
        mtsHomePage.scrollToOnlineReplenishment();
        assertTrue(mtsHomePage.isOnlineReplenishmentDisplay(), "Отображение названия блока 'Онлайн без комиссии'");
    }

    //Задание 2
    @Test
    @DisplayName("Проверка наличия логотипов платежных систем в блоке 'Онлайн без комиссии'")
    public void presenceLog() {
        MtsHomePage mtsHomePage = new MtsHomePage();
        mtsHomePage.openUrl("https://www.mts.by/");
        mtsHomePage.clickAcceptCookie();
        mtsHomePage.scrollToOnlineReplenishment();
        assertTrue(mtsHomePage.isPresenceLogoVisaDisplay(), "Отображение логотипа VISA в блоке 'Онлайн без комиссии'");
        assertTrue(mtsHomePage.isPresenceLogoVerifiedByVisa(), "Отображение логотипа Verified By VISA в блоке 'Онлайн без комиссии'");
        assertTrue(mtsHomePage.isPresenceLogoMasterCard(), "Отображение логотипа Master Card в блоке 'Онлайн без комиссии' ");
        assertTrue(mtsHomePage.isPresenceLogoMasterCardSecureCode(), "Отображение логотипа Master Card Secure Code в блоке 'Онлайн без комиссии'");
        assertTrue(mtsHomePage.isPresenceLogoBelCard(), "Отображение логотипа Белкарт  в блоке 'Онлайн без комиссии'");
    }

    //Задание 3
    @Test
    @DisplayName("Проверка работы ссылки 'Подробнее о сервисе' в блоке 'Онлайн без комиссии'")
    public void workService() {
        MtsHomePage mtsHomePage = new MtsHomePage();
        MoreAboutServicePage moreAboutServicePage = new MoreAboutServicePage();
        mtsHomePage.openUrl("https://www.mts.by/");
        mtsHomePage.clickAcceptCookie();
        mtsHomePage.scrollToOnlineReplenishment();
        mtsHomePage.clickAboutService();
        assertTrue(moreAboutServicePage.isPaymentByBankCardDisplay(), "Отображение логотипа 'Оплата банковской картой'");
    }

    //Задание 4
    @Test
    @DisplayName("Проверка работы кнопки 'Продолжить' в блоке 'Онлайн без комиссии'")
    public void workContinueButton() {
        MtsHomePage mtsHomePage = new MtsHomePage();
        mtsHomePage.openUrl("https://www.mts.by/");
        mtsHomePage.clickAcceptCookie();
        mtsHomePage.scrollToOnlineReplenishment();
        mtsHomePage.clickSelectorButton();
        assertTrue(mtsHomePage.isOpenFormDisplay());
        mtsHomePage.clickCommunicationServices();
        mtsHomePage.numberPhoneInputField();
        mtsHomePage.amountInputField();
        mtsHomePage.clickContinueButton();
    }
}

