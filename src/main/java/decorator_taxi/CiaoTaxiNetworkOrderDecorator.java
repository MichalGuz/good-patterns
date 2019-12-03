package decorator_taxi;

public class CiaoTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public CiaoTaxiNetworkOrderDecorator (TaxiOrder taxiOrder) {
        super(taxiOrder);
    }
}
