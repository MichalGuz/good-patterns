package factory_delivery_simple_factory;

import factory_delivery_basic_non_factory.CourierAlfaProduct;
import factory_delivery_basic_non_factory.CourierExpressProduct;
import factory_delivery_basic_non_factory.Product;

public class SimpleFactory {
    public Product createProduct(String type) {
        Product product = null;
        if(type.equals("Alfa")) {
            product = new CourierAlfaProduct();
        } else if (type.equals("Express")) {
            product= new CourierExpressProduct();
        }
        return product;
    }
}
