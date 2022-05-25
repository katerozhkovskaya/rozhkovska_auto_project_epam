package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import po.CardPage;
import po.DepositPage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static final String BASE_URL = "https://www.monobank.ua";
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.close();
        }
    }

    public CardPage getCardPage() {
        return new CardPage(driver);
    }

    public DepositPage getDepositPage() {
        return new DepositPage(driver);
    }
}
