package pages;

import org.openqa.selenium.WebDriver;


public class MainPage extends Page{

    public final String MAIN_PAGE_URL = "https://www.tinkoff.ru/";

    public MainPage(WebDriver driver) {
        super(driver);
    }

}