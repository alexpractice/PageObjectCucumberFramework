package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class CommunalPage extends Page {

    public CommunalPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div/span[2]")
    public WebElement curCity;

    @FindBy(xpath = "//li[1]/span[2]/a/span")
    public WebElement firstProvider;

    @FindBy(xpath = "//li/span[2]/a/span")
    public List<WebElement> providers;

    public static String firstProviderName;

}
