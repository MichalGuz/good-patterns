package strategy_broker;

public class IndividualOldCustomer extends Customer {
    public IndividualOldCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}
