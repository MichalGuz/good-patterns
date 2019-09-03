package easy_eats;

public class Producer {
    private String name;
    private String contact;
    private String account;
    private EasyEatsProcessor processor;

    public Producer(String name, String contact, String account, EasyEatsProcessor processor) {
        this.name = name;
        this.contact = contact;
        this.account = account;
        this.processor = processor;
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

    public EasyEatsProcessor getProcessor() {
        return processor;
    }
}
