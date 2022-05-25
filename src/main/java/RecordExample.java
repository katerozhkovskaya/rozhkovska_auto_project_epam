import entities.MenuRecord;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RecordExample {

    public static void main(String[] args) {

        MenuRecord menuItem1 = new MenuRecord("French fries", new BigDecimal("3.45"), 100);
        MenuRecord menuItem2 = new MenuRecord("Nuggets", new BigDecimal("13.75"), 150);
        MenuRecord menuItem3 = new MenuRecord("Cheeseburger", new BigDecimal("2.65"), 200);
        MenuRecord menuItem4 = new MenuRecord("French fries", new BigDecimal("3.45"), 100);

        List<MenuRecord> menuRecords = new ArrayList<>();
        menuRecords.add(menuItem1);
        menuRecords.add(menuItem2);
        menuRecords.add(menuItem3);

        menuRecords.forEach(menuItem -> {
            System.out.println("Item name is " + menuItem.name());
            System.out.println(menuItem.getFormattedItem());
            System.out.println("It weight is " + menuItem.weight());
        });

        System.out.println("Is menuItem1 equals to menuItem2?  - It's " + menuItem1.equals(menuItem2));
        System.out.println("Is menuItem1 equals to menuItem4?  - It's " + menuItem1.equals(menuItem4));

        System.out.println("menuItem1  hashCode is " + menuItem1.hashCode());
    }
}
