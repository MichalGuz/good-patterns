package factory_delivery_abstract_factory;

public class DoorToDoorDeliveryFactory implements DeliveryFactory {
    @Override
    public ModeOfDelivery chooseModeOfDelivery() {
        return new ModeOfDeliveryDoorToDoor();
    }

    @Override
    public Courier createCourier() {
        return new CourierBeta();
    }
}
