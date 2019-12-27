package factory_delivery_factory_method;

import factory_delivery_basic_non_factory.Product;

public class CourierBetaProductAmsterdam implements Product {
    @Override
    public void initializeDelivery() {
        System.out.println("Chose the Courier Beta delivery service by bicycle.");
    }

    @Override
    public void wrapUpItem() {
        System.out.println("Prepare a package for the Courier Beta delivery service by bicycle.");
    }

    @Override
    public void processDelivery() {
        System.out.println("Process the Courier Beta delivery service by bicycle.");
    }
}
