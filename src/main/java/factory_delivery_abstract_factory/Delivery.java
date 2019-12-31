package factory_delivery_abstract_factory;

public class Delivery {
    private String destination;
    private String idDelivery;
    private DeliveryMode deliveryMode;
    private Courier courier;

    public Delivery(String destination, String idDelivery, DeliveryFactory factory) {
        this.destination = destination;
        this.idDelivery = idDelivery;
        this.deliveryMode = factory.createDeliveryItem();
        this.courier = factory.createCourier();
        processDelivery();
    }

    private void processDelivery() {
        System.out.println("Initializing delivery.");
        deliveryMode.prepareDeliveryItem();
        courier.chooseCourier();
        System.out.println("Delivery was successful created.");
    }
}
