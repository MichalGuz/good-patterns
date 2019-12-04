package decorator_taxi;

public class ChildSeatDecorator extends AbstractTaxiOrderDecorator {
    public ChildSeatDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }
}
