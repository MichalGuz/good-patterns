package factory_delivery_simple_factory;

public class SimpleFactoryMain {
    public static void main(String[] args) {
        ProductProcess process = new ProductProcess(new SimpleFactory());

        // enter wrong name
        process.processProductOfSimpleFactory("Alfar");

        // enter right name
        process.processProductOfSimpleFactory("Express");
    }
}
