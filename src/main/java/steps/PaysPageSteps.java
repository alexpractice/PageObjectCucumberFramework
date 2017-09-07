package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pages.PaysPage;

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


public class PaysPageSteps extends AbsSteps {

    public PaysPage paysPage;

    public PaysPageSteps(){
        this.paysPage = new PaysPage(driver);
    }

    @Then("^страница ПЛАТЕЖИ загрузилась$")
    public void isLoaded(){
        waitForClickable(paysPage.communalPays);
        PageFactory.initElements(driver, this.paysPage);
    }

    @When("^выполнено нажатие на \"Коммунальные платежи\"$")
    public void communalPaysClick(){
        paysPage.communalPays.click();
    }

    @When("^\"поле поиска\" заполняется сохранённым провайдером$")
    public void sendCaseIntoSearchField(){
        paysPage.searchField.sendKeys(CommunalPageSteps.firstProviderName);
    }

    @Then("^сохранённый провайдер первый в списке$")
    public void prevProvidersIsNull(){
        assertTrue(driver.findElements(By.xpath("//div[contains(text(), '" + CommunalPageSteps.firstProviderName + "')]/../../../preceding-sibling::*")).size() == 0);
    }

    @When("^выполнено нажатие для перехода к странице сохраненного провайдера$")
    public void clickToFirstProvider(){
        wait.until(presenceOfElementLocated(By.xpath("//div[contains(text(), '" + CommunalPageSteps.firstProviderName + "')]"))).click();
    }
}
