package decorator_taxi;

import java.math.BigDecimal;

public class CyberTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public CyberTaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(50));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "by Cyber Taxi network";
    }

}
