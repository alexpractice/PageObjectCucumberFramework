package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.ZhKUMoskvaPage;


public class ZhKUMoskvaSteps extends AbsSteps {
    public ZhKUMoskvaPage zhKUMoskvaPage;

    public ZhKUMoskvaSteps(){
        this.zhKUMoskvaPage = new ZhKUMoskvaPage(driver);
    }

    @Then("^страница ЖКУ-МОСКВА загрузилась$")
    public void isLoaded(){
        waitForClickable(zhKUMoskvaPage.mainH);
        waitForClickable(zhKUMoskvaPage.toPayPage);
        PageFactory.initElements(driver, this.zhKUMoskvaPage);
    }

    @When("^выполнено нажатие на \"Оплатить ЖКУ\"$")
    public void clickToPayPage(){
        zhKUMoskvaPage.toPayPage.click();
    }
}
