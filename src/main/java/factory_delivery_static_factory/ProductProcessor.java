package factory_delivery_static_factory;

import factory_delivery_basic_non_factory.Product;

public class ProductProcessor {
    public void processProductOfStaticFactory(String type) {
        try{
            Product product = StaticFactory.createProduct(type);
            product.initializeDelivery();
            product.wrapUpItem();
            product.processDelivery();
        } catch (NullPointerException n) {
            System.out.println("Unknown type of courier company.\nPlease check the name of entered type and try again!");
        } finally {
            System.out.println("Factory delivery = Born for deliver! [static fabric]");
        }
    }
}
