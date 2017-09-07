package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AbsSteps {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public AbsSteps(){
        this.driver = Hooks.driver;
        this.wait = Hooks.wait;
    }

    protected void waitForClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}