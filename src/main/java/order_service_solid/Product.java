package order_service_solid;

public class Product {
    private String name;
    private String productId;
    private Double price;

    public Product(String name, String productId, Double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }

    public Double getPrice() {
        return price;
    }
}
