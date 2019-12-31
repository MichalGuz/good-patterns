package factory_delivery_abstract_factory;

public class ModeOfDeliveryParcelLocker implements DeliveryMode {
    public void prepareDeliveryItem(){
        System.out.println("Prepare packet.");
    }
}
