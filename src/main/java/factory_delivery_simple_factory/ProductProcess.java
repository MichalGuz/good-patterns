package factory_delivery_simple_factory;

import factory_delivery_basic_non_factory.Product;

public class ProductProcess {
    private SimpleFactory simpleFactory;

    public ProductProcess(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void doProcess(String type) {
        try {
            Product product = simpleFactory.createProduct(type);
            product.processDelivery();
            product.wrapUpItem();
            product.processDelivery();
        } catch (IllegalArgumentException e) {
            System.out.println("Unknown type of courier company.\nPlease check the name of entered type and try again!");
        } finally {
            System.out.println("Factory delivery = Born for deliver!");
        }
       }
}
