package easy_eats;

public class EasyEatsService implements EasyEatsOrderService {
    @Override
    public boolean order(Customer customer, Product product, Order order) {
        return true;
    }
}
