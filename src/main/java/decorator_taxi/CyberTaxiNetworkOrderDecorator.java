package decorator_taxi;

public class CyberTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public CyberTaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }
}
