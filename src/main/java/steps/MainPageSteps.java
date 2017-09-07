package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.MainPage;


public class MainPageSteps extends AbsSteps {

    public MainPage mainPage;

    public MainPageSteps(){
        this.mainPage = new MainPage(driver);
    }

    @Given("^открыта главная страница сайта$")
    public void open(){
        driver.get(mainPage.MAIN_PAGE_URL);
    }

    @When("^выполнено нажатие на \"Платежи\"$")
    public void clickToPayPage(){
        mainPage.pays.click();
    }
}
