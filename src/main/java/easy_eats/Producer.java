package easy_eats;

public class Producer {
    private String name;
    private String contact;
    private String account;

    public Producer(String name, String contact, String account) {
        this.name = name;
        this.contact = contact;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getAccount() {
        return account;
    }
}
