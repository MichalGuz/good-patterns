package factory_delivery_factory_method;

import factory_delivery_basic_non_factory.Product;

public class AmsterdamProductProcess extends AbstractProductProcessor {
    @Override
    protected Product createProduct(String type) {
        Product product = null;
        if (type.equals("Beta")){
            product = new CourierBetaProductAmsterdam();
        } else if (type.equals("Alpha")) {
            product = new CourierAlphaProductAmsterdam();
        }
        return product;
    }
}
