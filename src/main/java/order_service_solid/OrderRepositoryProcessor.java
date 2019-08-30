package order_service_solid;

public class OrderRepositoryProcessor implements OrderRepository {
    @Override
    public boolean createOrder(Customer customer, Product product, OrderData orderData){
        System.out.println("Order number: " + orderData.getNumberOfOrder()
                + " was saved in order repository");
        return true;
    }
}
