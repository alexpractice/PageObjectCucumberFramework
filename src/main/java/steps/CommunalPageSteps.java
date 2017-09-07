package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.CommunalPage;

import static org.junit.Assert.assertNotEquals;


public class CommunalPageSteps extends AbsSteps {
    public CommunalPage communalPage;

    public static String firstProviderName;

    public CommunalPageSteps(){
        this.communalPage = new CommunalPage(driver);
    }

    @Then("^страница Коммунальные платежи загрузилась$")
    public void isLoaded(){
        waitForClickable(communalPage.curCity);
        waitForClickable(communalPage.firstProvider);
        PageFactory.initElements(driver, this.communalPage);
    }

    @When("^установить город \"(.*)\"$")
    public void installCity(String cityName){
        if (!driver.getPageSource().contains("в " + cityName.substring(0, cityName.length() - 1))){
            communalPage.curCity.click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'г. " + cityName + "')]"))).click();
        }
        isLoaded();
    }

    @When("^запомнить первого провайдера$")
    public void getFirstProviderName(){
        firstProviderName = communalPage.firstProvider.getText();
    }

    @When("^выполнено нажатие на \"Оплатить ЖКУ в Москве\"$")
    public void toZhKU(){
        communalPage.firstProvider.click();
    }

    @Then("^запомненный провайдер отсутствует в списке$")
    public void checkFirstProvidersLos(){
        for (WebElement element : communalPage.providers) {
            assertNotEquals(firstProviderName, element.getText());
        }
    }
}
