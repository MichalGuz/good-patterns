package easy_eats;

public class EasyEatsMail implements EasyEatsContactService {
    @Override
    public void inform(Customer customer){
        System.out.println("Send email with confirmation of order to: " + customer.getCustomersEmail());
    }
}
