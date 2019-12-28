package factory_delivery_simple_factory;

import factory_delivery_basic_non_factory.CourierAlphaProduct;
import factory_delivery_basic_non_factory.CourierExpressProduct;
import factory_delivery_basic_non_factory.Product;

public class SimpleFactory {
    public Product createProduct(String type) {
        Product product = null;
        if(type.equals("Alpha")) {
            product = new CourierAlphaProduct();
        } else if (type.equals("Express")) {
            product = new CourierExpressProduct();
        } else {
            throw new IllegalArgumentException();
        }
        return product;
    }
}
