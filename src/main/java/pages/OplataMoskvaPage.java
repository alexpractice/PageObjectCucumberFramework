package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class OplataMoskvaPage extends Page {

    public OplataMoskvaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button/*[contains(text(), 'Оплатить ЖКУ в Москве')]")
    public WebElement payButton;

    @FindBy(xpath = "//div/input")
    public List<WebElement> fields;

    @FindBy(xpath = "//h1[contains(text(), 'Оплатите ЖКУ в Москве без комиссии')]")
    public WebElement mainH;

}
