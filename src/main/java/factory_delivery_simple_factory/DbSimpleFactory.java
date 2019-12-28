package factory_delivery_simple_factory;


import factory_delivery_basic_non_factory.CourierAlphaProduct;
import factory_delivery_basic_non_factory.CourierExpressProduct;
import factory_delivery_basic_non_factory.Product;

public class DbSimpleFactory extends SimpleFactory {
    private String dbConnection;

    public DbSimpleFactory(String dbConnection) {
        this.dbConnection = dbConnection;
    }

    public String getDbConnection() {
        return dbConnection;
    }

    @Override
    public Product createProduct(String type) {
        Product product;
        if (type.equals("Alpha")) {
            product = new CourierAlphaProduct();
        } else if (type.equals("Express")) {
            product = new CourierExpressProduct();
        } else {
            throw new IllegalArgumentException();
        }
        return product;
    }
}
