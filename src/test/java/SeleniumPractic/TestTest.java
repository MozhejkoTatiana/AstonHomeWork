package SeleniumPractic;

import org.junit.jupiter.api.Test;

public class TestTest extends BaseTest{
    @Test
    public void openPage() throws InterruptedException {
        TestPage testPage = new TestPage();
        testPage.openUrl("https://www.youtube.com/");
        testPage.pressBtn();
        Thread.sleep(5000);
    }
}
