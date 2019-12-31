package factory_delivery_abstract_factory;

public class EnvelopeDeliveryFactory implements DeliveryFactory {
    @Override
    public DeliveryMode createDeliveryItem() {
        return new DeliveryModeEnvelope();
    }

    @Override
    public Courier createCourier() {
        return new CourierBeta();
    }
}
