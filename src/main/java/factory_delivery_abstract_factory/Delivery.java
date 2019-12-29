package factory_delivery_abstract_factory;

public class Delivery {
    private String destination;
    private String idDelivery;
    private DeliveryItem deliveryItem;
    private Courier courier;

    public Delivery(String destination, String idDelivery, DeliveryItem deliveryItem, Courier courier) {
        this.destination = destination;
        this.idDelivery = idDelivery;
        this.deliveryItem = deliveryItem;
        this.courier = courier;
    }
}
