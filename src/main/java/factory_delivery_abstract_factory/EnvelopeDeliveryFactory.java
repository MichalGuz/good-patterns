package factory_delivery_abstract_factory;

public class EnvelopeDeliveryFactory implements DeliveryFactory {
    @Override
    public ModeOfDelivery createDeliveryItem() {
        return new ModeOfDeliveryDoorToDoor();
    }

    @Override
    public Courier createCourier() {
        return new CourierBeta();
    }
}
