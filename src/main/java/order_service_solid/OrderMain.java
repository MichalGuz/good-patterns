package order_service_solid;

import java.time.LocalDate;

public class OrderMain {
    public static void main(String[] args) {
        Customer customerOne = new Customer("John", "Smith", "00001", "johnsmith@mail.com");
        Product product1 = new Product("watch", "01234567", 650.0);
        OrderData orderData = new OrderData(LocalDate.of(2019, 8, 28), "0000001", 1, 650.0);

        ProductOrderProcessor orderProcessor = new ProductOrderProcessor(new OrderServiceProcessor(), new OrderRepositoryProcessor(), new OrderMailService());
    }

}
