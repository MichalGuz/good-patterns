package order_service_solid;

public class OrderRepositoryProcessor implements OrderRepository {
    @Override
    public boolean createOrder(Customer customer, Product product, OrderData orderData){
        return true;
    }
}
