import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainTest {
    @Test
    public void checkTitle(){}









   /* @FindBy(xpath = "//div[@id='search-input']")
    private WebElement searchBtn;

    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
        actions.moveToElement(searchBtn).click().sendKeys("kuuzya").build().perform();
        Thread.sleep(5000);
        driver.quit();
    }*/
}
