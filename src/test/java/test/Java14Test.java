package test;

import static entities.enums.Card.CHILD;

import entities.enums.Card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class Java14Test extends BaseTest {

    @ParameterizedTest
    @EnumSource(Card.class)
    void checkCardLinkWithSwitch(Card card) {
        getCardPage().clickCardMenu().clickOnCard(card);
        String actualUrl = BASE_URL + "/" + card.name().toLowerCase();
        String expectedUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl);
    }

    @Test
    void checkCardWithNullPointerException() {
        getCardPage().clickCardMenu().clickOnCard(CHILD);
        String actual = null;
        String expected = getDriver().getCurrentUrl();
        Assertions.assertEquals(expected.toLowerCase(), actual.toLowerCase());
    }

    @Test
    void checkDepositCalculation() {
        getCardPage().clickDepositMenu();
        String actual = getDepositPage().setDepositSum().getDepositSum();
        Assertions.assertEquals("2 193,2\n₴", actual);

    }
}