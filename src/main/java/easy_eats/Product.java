package easy_eats;

public class Product {
    private Producer producer;
    private String productsName;
    private String productsId;
    private Double productsPrice;

    public Product(Producer producer, String productsName, String productsId, Double productsPrice) {
        this.producer = producer;
        this.productsName = productsName;
        this.productsId = productsId;
        this.productsPrice = productsPrice;
    }

    public Producer getProducer() {
        return producer;
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
