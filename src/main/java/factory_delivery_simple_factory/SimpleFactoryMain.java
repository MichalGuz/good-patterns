package factory_delivery_simple_factory;

public class SimpleFactoryMain {
    public static void main(String[] args) {
        ProductProcess process = new ProductProcess(new SimpleFactory());
        process.doProcess("Alfar");
    }
}
