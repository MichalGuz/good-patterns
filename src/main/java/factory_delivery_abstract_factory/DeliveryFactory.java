package factory_delivery_abstract_factory;

public interface DeliveryFactory {
    DeliveryMode createDeliveryItem();
    Courier createCourier();
}
