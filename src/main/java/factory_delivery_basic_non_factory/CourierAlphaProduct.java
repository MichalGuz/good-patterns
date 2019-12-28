package factory_delivery_basic_non_factory;

public class CourierAlphaProduct implements Product{
    @Override
    public void initializeDelivery() {
        System.out.println("Choose the Courier Alpha delivery.");
    }

    @Override
    public void wrapUpItem() {
        System.out.println("Prepare a package for Courier Alpha.");
    }

    @Override
    public void processDelivery() {
        System.out.println("Process the delivery by Courier Alpha.");
    }
}
