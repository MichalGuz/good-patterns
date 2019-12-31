package factory_delivery_abstract_factory;

public class ModeOfParcelLockerOfDelivery implements ModeOfDelivery {
    public void prepareDeliveryItem(){
        System.out.println("Prepare packet.");
    }
}
