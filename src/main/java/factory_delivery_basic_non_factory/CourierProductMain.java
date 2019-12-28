package factory_delivery_basic_non_factory;

public class CourierProductMain {
    public void process(String type) {
        Product product = null;
        if(type.equals("Alpha")) {
            product = new CourierAlphaProduct();
        } else if (type.equals("Express")) {
            product = new CourierExpressProduct();
        }

        product.initializeDelivery();

        product.wrapUpItem();

        product.processDelivery();
    }

    public static void main(String[] args) {
        CourierProductMain courierProductMain = new CourierProductMain();
        courierProductMain.process("Alpha");
    }
}
