package factory_delivery_abstract_factory;

public interface DeliveryFactory {
    ModeOfDelivery chooseModeOfDelivery();
    Courier createCourier();
}
