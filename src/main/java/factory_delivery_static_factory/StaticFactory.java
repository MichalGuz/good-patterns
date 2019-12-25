package factory_delivery_static_factory;

import factory_delivery_basic_non_factory.Product;

public class StaticFactory {
    public static Product createProduct(String type) {
        Product product = null;
        if (type.equals("Beta")) {
            product = new CourierBetaProduct();
        } else if (type.equals("Master")) {
            product = new CourierMasterProduct();
        }
        return product;
    }
}
