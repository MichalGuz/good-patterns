package factory_delivery_static_factory;

public class StaticFactoryMain {
    public static void main(String[] args) {
        ProductProcessor pr = new ProductProcessor();
        pr.processProductOfStaticFactory("Master");
        pr.processProductOfStaticFactory("Mater");
    }
}
