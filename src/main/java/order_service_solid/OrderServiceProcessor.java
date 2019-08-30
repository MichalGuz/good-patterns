package order_service_solid;

public class OrderServiceProcessor implements OrderService {
    @Override
    public boolean order(Customer customer, Product product, OrderData orderData){
        System.out.println("Order number: " + orderData.getNumberOfOrder() + "\n"
                + "Date of placed of order: " + orderData.getDateOfOrder() + "\n"
                + "Purchaser: " + customer.getName() + " " + customer.getSurname() + ", ID of User: " + customer.getCustomersNumber() + ".\n"
                + "Details of the order:\n" + "[Product ID] " + product.getProductId()
                + "\n[Product] " + product.getName() + "\n[Price] " + product.getPrice()
                + "\n[Quantity] " + orderData.getQuintityOfProducts() + "\n[Total price: ] " + orderData.getTotalPriceOfOrder());
        return true;
    }
}
