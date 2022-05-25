package entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public record MenuRecord(String name, BigDecimal price, int weight) {

    public  String getFormattedItem(){
        return name + " costs $"  + price.setScale(2, RoundingMode.CEILING);
    }
}

