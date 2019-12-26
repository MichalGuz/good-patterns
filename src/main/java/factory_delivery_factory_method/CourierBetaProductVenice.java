package factory_delivery_factory_method;

import factory_delivery_basic_non_factory.Product;

public class CourierBetaProductVenice implements Product {
    public void initializeDelivery() {
        System.out.println("Chose the Courier Beta delivery service by boat.");
    }

    public void wrapUpItem() {
        System.out.println("Prepare a package for the Courier Beta delivery service by boat.");
    }

    public void processDelivery() {
        System.out.println("Process the Courier Beta delivery service by boat.");
    }
}
