package easy_eats;

public class Customer {
    private String customersName;
    private String customersId;
    private String customersAdress;
    private String customersEmail;

    public Customer(String customersName, String customersId, String customersAdress, String customersEmail) {
        this.customersName = customersName;
        this.customersId = customersId;
        this.customersAdress = customersAdress;
        this.customersEmail = customersEmail;
    }

    public String getCustomersName() {
        return customersName;
    }

    public String getCustomersId() {
        return customersId;
    }

    public String getCustomersAdress() {
        return customersAdress;
    }

    public String getCustomersEmail() {
        return customersEmail;
    }
}
