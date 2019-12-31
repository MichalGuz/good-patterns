package factory_delivery_abstract_factory;

public class PacketDeliveryFactory implements DeliveryFactory {
    public DeliveryMode createDeliveryItem() {
        return new DeliveryModePacket();
    }

    public Courier createCourier() {
        return new CourierAlpha();
    }
}
