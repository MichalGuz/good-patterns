package easy_eats;

public class EasyEatsRepo implements EasyEatsOrderRepository {
    @Override
    public boolean createOrder(Customer customer, Product product, Order order) {
        System.out.println("Order number: " + order.getOrderId()
                + " was saved in order repository");
        return true ;
    }
}
