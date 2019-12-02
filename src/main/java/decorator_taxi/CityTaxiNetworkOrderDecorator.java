package decorator_taxi;


import java.math.BigDecimal;

public class CityTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public CityTaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(40));
    }
}
