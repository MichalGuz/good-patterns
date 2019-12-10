package decorator_taxi;

import java.math.BigDecimal;

public class CiaoTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public CiaoTaxiNetworkOrderDecorator (TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        // hardcoded stub cost = 20
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with CiaoTaxi network";
    }
}
