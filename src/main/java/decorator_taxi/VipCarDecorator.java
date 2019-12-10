package decorator_taxi;

import java.math.BigDecimal;

public class VipCarDecorator extends AbstractTaxiOrderDecorator {
    public VipCarDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20));
    }
}
