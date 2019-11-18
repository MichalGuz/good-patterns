package decorator_taxi;

import java.math.BigDecimal;

public class BasicTaxiOrder implements TaxiOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(10);
    }

    @Override
    public String getDescription() {
        return "Selected course";
    }
}
