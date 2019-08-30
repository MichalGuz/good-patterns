package order_service_solid;

public class Customer {
    private String name;
    private String surname;
    private String customersNumber;
    private String emailAdress;

    public Customer(String name, String surname, String customersNumber, String emailAdress) {
        this.name = name;
        this.surname = surname;
        this.customersNumber = customersNumber;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCustomersNumber() {
        return customersNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
