package factory_delivery_simple_factory;

import factory_delivery_basic_non_factory.Product;

public class ProductProcess {
    private SimpleFactory simpleFactory;

    public ProductProcess(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void doProcess(String type) {
        Product product = simpleFactory.createProduct(type);
    }
}
