package easy_eats;

public class EasyEaysRepo implements EasyEatsOrderRepository {
    @Override
    public boolean createOrder(Customer customer, Product product, Order order) {
        System.out.println("Order number: " + order.getOrderId()
                + " was saved in order repository");
        return true ;
    }
}
