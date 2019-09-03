package easy_eats;

public interface EasyEatsOrderRepository {
    boolean createOrder(Customer customer, Product product, Order order);
}
