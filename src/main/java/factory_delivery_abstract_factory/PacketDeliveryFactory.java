package factory_delivery_abstract_factory;

public class PacketDeliveryFactory implements DeliveryFactory {
    public ModeOfDelivery createDeliveryItem() {
        return new ModeOfParcelLockerOfDelivery();
    }

    public Courier createCourier() {
        return new CourierAlpha();
    }
}
