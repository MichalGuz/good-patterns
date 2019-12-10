package decorator_taxi;

public class VipCarDecorator extends AbstractTaxiOrderDecorator{
    public VipCarDecorator( TaxiOrder taxiOrder) {
        super(taxiOrder);
    }
}
