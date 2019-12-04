package decorator_taxi;

public class ChildseatDecorator extends AbstractTaxiOrderDecorator {
    public ChildseatDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }
}
