package po;

import entities.enums.Card;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href,\"card\")]")
    private WebElement cardsMenu;

    @FindBy(xpath = "//a[contains(@href,\"deposit\")]/parent::li")
    private WebElement depositMenu;

    @FindBy(xpath = "//div[contains(@class,'cards-modal')]//a[contains(@href,'iron')]")
    private WebElement ironCard;

    @FindBy(xpath = "//div[contains(@class,'cards-modal')]//a[contains(@href,'platinum')]")
    private WebElement platinumCard;

    @FindBy(xpath = "//div[contains(@class,'cards-modal')]//a[contains(@href,'14')]")
    private WebElement childCard;

    @FindBy(xpath = "//div[contains(@class,'cards-modal')]//a[contains(@href,'white')]")
    private WebElement whiteCard;


    public CardPage(WebDriver driver) {
        super(driver);
    }

    public CardPage clickCardMenu() {
        cardsMenu.click();
        return this;
    }

    public DepositPage clickDepositMenu() {
        waitForElement(depositMenu, driver);
        depositMenu.click();
        return new DepositPage(driver);
    }

    public void clickOnCard(Card cardName) {
        switch (cardName) {
            case IRON -> {
                ironCard.click();
            }
            case PLATINUM -> {
                platinumCard.click();
            }
            case CHILD -> {
                childCard.click();
            }
            case WHITE -> {
                whiteCard.click();
            }
            default -> {
                System.out.println("Not valid card name");
            }
        }
    }
}
