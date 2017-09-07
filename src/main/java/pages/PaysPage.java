package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PaysPage extends Page {

    public PaysPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[starts-with(text(), 'Коммунальные платежи')]")
    public WebElement communalPays;

    @FindBy(xpath = "//span[contains(text(), 'Что оплатить')]/following-sibling::input")
    public WebElement searchField;

}
