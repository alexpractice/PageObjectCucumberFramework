package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Hooks;


public abstract class Page {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"mainMenu\"]/li[3]//a")
    public WebElement pays;

    public Page(WebDriver driver) {
        this.driver = Hooks.driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 30);
    }

    protected void waitForClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
