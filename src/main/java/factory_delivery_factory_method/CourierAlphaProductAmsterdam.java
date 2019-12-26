package factory_delivery_factory_method;

import factory_delivery_basic_non_factory.Product;

public class CourierAlphaProductAmsterdam implements Product {
    public void initializeDelivery() {
        System.out.println("Chose the Courier Alpha delivery service by bicycle.");
    }

    public void wrapUpItem() {
        System.out.println("Prepare a package for the Courier Alpha delivery service by bicycle.");
    }

    public void processDelivery() {
        System.out.println("Process the Courier Alpha delivery service by bicycle.");
    }
}
