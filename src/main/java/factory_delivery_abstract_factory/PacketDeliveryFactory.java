package factory_delivery_abstract_factory;

public class PacketDeliveryFactory implements DeliveryFactory {
    public DeliveryMode createDeliveryItem() {
        return new ModeOfDeliveryParcelLocker();
    }

    public Courier createCourier() {
        return new CourierAlpha();
    }
}
