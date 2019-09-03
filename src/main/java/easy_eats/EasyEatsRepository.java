package easy_eats;

public interface EasyEatsRepository {
    boolean createOrder(Customer customer, Product product, Order order);
}
