package factory_delivery_basic_non_factory;

public class CourierAlfaProduct implements Product{
    private String name;
    private String id;
    private String sender;
    private String receiver;

    @Override
    void initializeDelivery() {
        System.out.println("Chose the Courier Alfa delivery.");
    }
}
