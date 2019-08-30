package order_service_solid;

public class OrderMailService implements InformationService {
    @Override
    public void inform(Customer customer){
        System.out.println("Send email with confirmation of order to: " + customer.getEmailAdress());
    }
}
