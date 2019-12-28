package factory_delivery_factory_method;

import factory_delivery_basic_non_factory.Product;

public class VeniceProductProcess extends AbstractProductProcessor {
    @Override
    public Product createProduct(String type) {
        Product product = null;
        if(type.equals("Beta")) {
            product = new CourierBetaProductVenice();
        } else if (type.equals("Alpha")) {
            product = new CourierAlphaProductVenice();
        }
        return product;
    }
}

