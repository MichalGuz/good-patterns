package factory_delivery_abstract_factory;

public class PacketDeliveryFactory implements DeliveryFactory {
    public DeliveryItem createDeliveryItem() {
        return new DeliveryItemPacket();
    }

    public Courier createCourier() {
        return new CourierAlpha();
    }
}
