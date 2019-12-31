package factory_delivery_abstract_factory;

public class DeliveryModePacket implements DeliveryMode {
    public void prepareDeliveryItem(){
        System.out.println("Prepare packet.");
    }
}
