package factory_delivery_factory_method;

import factory_delivery_basic_non_factory.Product;

public class CourierAlphaProductVenice implements Product {
    @Override
    public void initializeDelivery() {
        System.out.println("Choose the Courier Alpha delivery service by boat.");
    }

    @Override
    public void wrapUpItem() {
        System.out.println("Prepare a package for the Courier Alpha delivery service by boat.");
    }

    @Override
    public void processDelivery() {
        System.out.println("Process the Courier Alpha delivery service by boat.");
    }
}
