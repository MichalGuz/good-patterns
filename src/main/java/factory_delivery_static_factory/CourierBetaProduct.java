package factory_delivery_static_factory;

import factory_delivery_basic_non_factory.Product;

public class CourierBetaProduct implements Product {
    public void initializeDelivery() {
        System.out.println("Choose the Courier Beta delivery.");
    }

    public void wrapUpItem() {
        System.out.println("Prepare a package for Courier Beta.");
    }

    public void processDelivery() {
        System.out.println("Process the delivery by Courier Beta.");
    }
}
