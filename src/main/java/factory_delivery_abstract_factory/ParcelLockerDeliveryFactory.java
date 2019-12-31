package factory_delivery_abstract_factory;

public class ParcelLockerDeliveryFactory implements DeliveryFactory {
    public ModeOfDelivery chooseModeOfDelivery() {
        return new ModeOfParcelLockerOfDelivery();
    }

    public Courier createCourier() {
        return new CourierAlpha();
    }
}
