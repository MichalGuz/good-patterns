package decorator_taxi;

import java.math.BigDecimal;

public class AbstractTaxiOrderDecorator implements TaxiOrder {
    private final TaxiOrder taxiOrder;

    @Override
    public BigDecimal getCost(){
        return taxiOrder.getCost();
    }
}
