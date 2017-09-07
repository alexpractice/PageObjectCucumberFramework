package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.OplataMoskvaPage;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class OplataMoskvaSteps extends AbsSteps{

    public OplataMoskvaPage oplataMoskvaPage;

    private String pageUrl;

    public OplataMoskvaSteps(){
        this.oplataMoskvaPage = new OplataMoskvaPage(driver);
    }

    @Then("^страница ОПЛАТА ЖКУ загрузилась$")
    public void isLoaded(){
        waitForClickable(oplataMoskvaPage.mainH);
        waitForClickable(oplataMoskvaPage.payButton);
        PageFactory.initElements(driver, this.oplataMoskvaPage);
    }

    @When("^выполнено нажатие на \"Кнопка оплаты\"$")
    public void clickToPayPage(){
        oplataMoskvaPage.payButton.click();
    }


    @When("^(.*)-ое поле заполняется значением \"(.*)\"$")
    public void sendCaseIntoField(int fieldNum, String value){
        oplataMoskvaPage.fields.get(fieldNum-1).sendKeys(value);
    }

    @When("^(.*)-ое поле очищено$")
    public void clearField(int fieldNum){
        oplataMoskvaPage.fields.get(fieldNum-1).clear();
    }

    @Then("^на экране \"(.*)\" сообщения об ошибке c текстом \"(.*)\"$")
    public void checkNoticeCounterOnScreen(int count, String errorText){
        assertEquals(driver.findElements(By.xpath("//*[contains(text(), '" + errorText + "')]")).size(), count);
    }

    @Then("^на экране есть текст \"(.*)\"$")
    public void checkTextOnScreen(String text){
        noticeIsDisplayed(driver.findElement(By.xpath("//*[contains(text(), '" + text + "')]")));
    }

    @Then("^на экране нет сообщений об ошибках$")
    public void checkLostError(){
        noticeDisappear(driver.findElements(By.xpath("//*[contains(text(), 'Максимальная сумма перевода') or contains(text(),'Минимальная сумма перевода') or contains(text(),'Поле заполнено некорректно') or contains(text(),'Поле неправильно заполнено')]")));
    }

    @When("^запомнить страницу оплаты$")
    public void savePageInMemory(){
        pageUrl = driver.getCurrentUrl();
    }

    @Then("^странница оплаты та же, что и при переходе из меню$")
    public void checkPage(){
        assertEquals(pageUrl, driver.getCurrentUrl());
    }

    private void noticeDisappear(List<WebElement> elementList){
        assertTrue(elementList.size() == 0);
    }

    private void noticeIsDisplayed(WebElement element){
        assertTrue(element.isDisplayed());
    }
}
