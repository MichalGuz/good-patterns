package easy_eats;

import java.time.LocalDate;

public class EasyEatsMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "0001", "Poland", "john@john.com");
        Product product1 = new Product(new OrganicFoodProducer(), "aa1", "P-ID 20433", 200.0);
        Order order1 = new Order("190904-0001", LocalDate.of(2019, 9,4 ), 200.00);

        OrderRequest request = new OrderRequest(customer1, product1,order1);
        EasyEatsApplication app = new EasyEatsApplication(new EasyEatsService(), new EasyEaysRepo(), new EasyEatsMail(), new OrganicFoodProducer());
        app.process(request);

    }
}
