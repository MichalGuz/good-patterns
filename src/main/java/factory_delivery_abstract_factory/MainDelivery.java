package factory_delivery_abstract_factory;

public class MainDelivery {
    public static void main(String[] args) {
        DeliveryFactory delivery = new EnvelopeDeliveryFactory();
        delivery.createCourier().chooseCourier(new CourierBeta());
        delivery.createDeliveryItem();

//        delivery = new Delivery("a", "b", );
    }
}
