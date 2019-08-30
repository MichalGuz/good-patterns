package order_service_solid;

public interface OrderService {
    boolean order(Customer customer, Product product, OrderData orderData);
}
