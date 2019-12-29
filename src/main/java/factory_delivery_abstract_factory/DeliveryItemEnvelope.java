package factory_delivery_abstract_factory;

public class DeliveryItemEnvelope implements DeliveryItem {
    public void prepareDeliveryItem(){
        System.out.println("Prepare envelope.");
    }
}
