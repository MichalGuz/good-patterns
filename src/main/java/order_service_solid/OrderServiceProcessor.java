package order_service_solid;

public class OrderServiceProcessor implements OrderService {
    @Override
    public boolean order(Customer customer, Product product, OrderData orderData){
        return true;
    }
}
