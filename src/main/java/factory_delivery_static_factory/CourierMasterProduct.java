package factory_delivery_static_factory;

import factory_delivery_basic_non_factory.Product;

public class CourierMasterProduct implements Product {
    public void initializeDelivery() {
        System.out.println("Chose the Courier Master delivery.");
    }
    public void wrapUpItem() {
        System.out.println("Prepare a package for Courier Master.");
    }
    public void processDelivery() {
        System.out.println("Process the delivery by Courier Master.");
    }
}
