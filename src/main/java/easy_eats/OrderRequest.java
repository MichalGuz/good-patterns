package easy_eats;

public class OrderRequest {
    private Customer customer;
    private Product product;
    private Order order;

    public OrderRequest(Customer customer, Product product, Order order) {
        this.customer = customer;
        this.product = product;
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public Order getOrder() {
        return order;
    }
}
