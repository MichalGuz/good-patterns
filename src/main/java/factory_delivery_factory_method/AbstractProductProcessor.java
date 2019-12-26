package factory_delivery_factory_method;

import factory_delivery_basic_non_factory.Product;

import static factory_delivery_static_factory.StaticFactory.createProduct;

public abstract class AbstractProductProcessor {
    public void process(String type) {
        Product product = createProduct(type);
    }
}
