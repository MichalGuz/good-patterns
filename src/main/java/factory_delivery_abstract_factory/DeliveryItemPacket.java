package factory_delivery_abstract_factory;

public class DeliveryItemPacket implements DeliveryItem {
    public void prepareDeliveryItem(){
        System.out.println("Prepare packet.");
    }
}
