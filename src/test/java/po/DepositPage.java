package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositPage extends BasePage {

    @FindBy(xpath = "(//input[contains(@class,'calculator')])[1]")
    private WebElement sumInput;

    @FindBy(xpath = "//span[contains(@data-calc-display,'result')]/parent::span/parent::div")
    private WebElement resultSum;

    public DepositPage(WebDriver driver) {
        super(driver);
    }

    public DepositPage setDepositSum() {
        waitForElement(sumInput, driver);
        sumInput.clear();
        sumInput.sendKeys("2000");
        return this;
    }

    public String getDepositSum() {
        return resultSum.getText();
    }

}
