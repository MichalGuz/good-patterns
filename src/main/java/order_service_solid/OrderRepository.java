package order_service_solid;

public interface OrderRepository {
    boolean createOrder(Customer customer, Product product, OrderData orderData);
}
