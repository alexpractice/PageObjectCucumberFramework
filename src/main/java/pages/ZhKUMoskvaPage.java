package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ZhKUMoskvaPage extends Page {

    public ZhKUMoskvaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//li[2]/span/a/span)[2]")
    public WebElement toPayPage;

    @FindBy(xpath = "//h1[contains(text(), 'Узнайте задолженность по ЖКУ в Москве')]")
    public WebElement mainH;

}
