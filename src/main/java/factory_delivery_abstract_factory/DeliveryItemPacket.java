package factory_delivery_abstract_factory;

public class DeliveryItemPacket implements DeliveryItem {
    public void prepareDeliveryItem(double weight, int length, int width, int height){
        System.out.println("Prepare packet. Measurements of packet: \n   - weight: " + weight + " kg\n   - length: " + length + " cm\n   - width: "  + width + " cm\n   - height: " + height + " cm\nPacket is ready.\n");
    }
}
