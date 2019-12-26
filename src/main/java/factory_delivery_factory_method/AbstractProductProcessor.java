package factory_delivery_factory_method;

import factory_delivery_basic_non_factory.Product;

import static factory_delivery_static_factory.StaticFactory.createProduct;

public abstract class AbstractProductProcessor {
    protected abstract Product createProduct(String type);

    public void process(String type) {
        Product product = createProduct(type);
        product.initializeDelivery();
        product.wrapUpItem();
        product.processDelivery();
    }
}
