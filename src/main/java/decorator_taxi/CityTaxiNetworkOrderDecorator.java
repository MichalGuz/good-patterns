package decorator_taxi;

public class CityTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public CityTaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }
}
