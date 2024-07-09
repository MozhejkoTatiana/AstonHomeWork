package SeleniumPractic;

import org.example.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage extends BasePage {
    @FindBy(xpath = "//div[@id='search-input']")
    private WebElement searchBtn;
    public TestPage(){
        PageFactory.initElements(driver,this);
    }
    public  TestPage pressBtn(){
        Actions actions = new Actions(driver);
        actions.moveToElement(searchBtn).click().sendKeys("kuuzya").build().perform();
        return this;
    }
}
