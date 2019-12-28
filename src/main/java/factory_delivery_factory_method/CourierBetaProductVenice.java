package factory_delivery_factory_method;

import factory_delivery_basic_non_factory.Product;

public class CourierBetaProductVenice implements Product {
    @Override
    public void initializeDelivery() {
        System.out.println("Choose the Courier Beta delivery service by boat.");
    }

    @Override
    public void wrapUpItem() {
        System.out.println("Prepare a package for the Courier Beta delivery service by boat.");
    }

    @Override
    public void processDelivery() {
        System.out.println("Process the Courier Beta delivery service by boat.");
    }
}
