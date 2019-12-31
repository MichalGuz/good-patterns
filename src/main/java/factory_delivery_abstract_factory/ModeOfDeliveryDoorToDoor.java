package factory_delivery_abstract_factory;

public class ModeOfDeliveryDoorToDoor implements DeliveryMode {
    public void prepareDeliveryItem(){
        System.out.println("Prepare envelope.");
    }
}
