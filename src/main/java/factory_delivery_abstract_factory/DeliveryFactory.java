package factory_delivery_abstract_factory;

public interface DeliveryFactory {
    DeliveryItem createDeliveryItem();
    Courier createCourier();
}
