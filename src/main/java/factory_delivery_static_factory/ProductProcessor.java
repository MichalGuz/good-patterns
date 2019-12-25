package factory_delivery_static_factory;

import factory_delivery_basic_non_factory.Product;

public class ProductProcessor {
    public void processProductOfStaticFactory(String type) {
            Product product = StaticFactory.createProduct(type);
            product.initializeDelivery();
            product.wrapUpItem();
            product.processDelivery();
    }
}
