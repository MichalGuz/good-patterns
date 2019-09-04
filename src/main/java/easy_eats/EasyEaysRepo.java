package easy_eats;

public class EasyEaysRepo implements EasyEatsOrderRepository {
    @Override
    public boolean createOrder(Customer customer, Product product, Order order) {
        System.out.println("Order number: " + order.getOrderId() + "\n"
                + "Date of placed of order: " + order.getDateOfOrder() + "\n"
                + "Purchaser: " + customer.getCustomersName() + ", ID of User: " + customer.getCustomersId() + ".\n"
                + "Details of the order:\n" + "[Product ID] " + product.getProductsId()
                + "\n[Product] " + product.getProductsName() + "\n[Price] " + product.getProductsPrice()
                + "\n[ID of order] " + order.getOrderId() + "\n[Total price: ] " + order.getTotalPrice());
        return true ;
    }
}
