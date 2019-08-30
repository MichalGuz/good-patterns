package order_service_solid;

public class OrderRequest {
    Customer customer;
    Product product;
    OrderData orderData;

    public OrderRequest(Customer customer, Product product, OrderData orderData) {
        this.customer = customer;
        this.product = product;
        this.orderData = orderData;
    }
}
