package factory_delivery_abstract_factory;

public class DeliveryModeEnvelope implements DeliveryMode {
    public void prepareDeliveryItem(){
        System.out.println("Prepare envelope.");
    }
}
