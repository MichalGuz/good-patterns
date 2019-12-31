package factory_delivery_abstract_factory;

public class Delivery {
    private String destination;
    private String idDelivery;
    private ModeOfDelivery modeOfDelivery;
    private Courier courier;

    public Delivery(String destination, String idDelivery, DeliveryFactory factory) {
        this.destination = destination;
        this.idDelivery = idDelivery;
        this.modeOfDelivery = factory.createDeliveryItem();
        this.courier = factory.createCourier();
        processDelivery();
    }

    private void processDelivery() {
        System.out.println("Initializing delivery.");
        modeOfDelivery.prepareDeliveryItem();
        courier.chooseCourier();
        System.out.println("Delivery was successful created.");
    }
}
