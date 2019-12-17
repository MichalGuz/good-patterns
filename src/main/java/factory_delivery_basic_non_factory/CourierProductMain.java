package factory_delivery_basic_non_factory;

public class CourierProductMain {
    String type;

    public void process(String type) {
        Product product;
        if(type.equals("Alfa")) {
            product = new CourierAlfaProduct();
        } else if (type.equals("Express")) {
            product= new CourierExpressProduct();
        }
    }
}
