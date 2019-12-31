package factory_delivery_abstract_factory;

public class ParcelLockerDeliveryFactory implements DeliveryFactory {
    public ModeOfDelivery createModeOfDelivery() {
        return new ModeOfDeliveryParcelLocker();
    }

    public Courier createCourier() {
        return new CourierAlpha();
    }
}
