package factory_delivery_abstract_factory;

public class EnvelopeDeliveryFactory implements DeliveryFactory {
    @Override
    public DeliveryItem createDeliveryItem() {
        return new DeliveryItemEnvelope();
    }

    @Override
    public Courier createCourier() {
        return new CourierBeta();
    }
}
