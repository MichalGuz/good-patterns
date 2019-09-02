package easy_eats;

public class Product {
    private String productsName;
    private String productsId;
    private Double productsPrice;

    public Product(String productsName, String productsId, Double productsPrice) {
        this.productsName = productsName;
        this.productsId = productsId;
        this.productsPrice = productsPrice;
    }

    public String getProductsName() {
        return productsName;
    }

    public String getProductsId() {
        return productsId;
    }

    public Double getProductsPrice() {
        return productsPrice;
    }
}
