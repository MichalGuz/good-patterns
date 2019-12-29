package factory_delivery_abstract_factory;

public class DeliveryItemEnvelope implements DeliveryItem {
    public void prepareDeliveryItem(double weight, int length, int width, int height){
        System.out.println("Prepare envelope. Measurements of envelope:\n   - weight: " + weight + " kg\n   - length: " + length + " cm\n   - width: "  + width + " cm\n   - height: " + height + " cm\nEnvelope is ready.\n");
    }
}
