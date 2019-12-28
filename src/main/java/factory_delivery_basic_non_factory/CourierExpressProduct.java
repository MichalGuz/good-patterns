package factory_delivery_basic_non_factory;

public class CourierExpressProduct implements Product {
    private String name;
    private String id;
    private String sender;
    private String receiver;

    @Override
    public void initializeDelivery() {
        System.out.println("Choose the Courier Express delivery.");
    }

    @Override
    public void wrapUpItem() {
        System.out.println("Prepare a package for Courier Expresss.");
    }

    @Override
    public void processDelivery() {
        System.out.println("Process the delivery by Courier Express.");
    }

    public void sendMessageToReceiver() {
        System.out.println("Hello! Your package is in transit.");
    }

}
