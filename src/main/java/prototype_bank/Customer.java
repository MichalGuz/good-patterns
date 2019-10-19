package prototype_bank;

import java.util.HashSet;
import java.util.Set;

public final class Customer {
    private final String customerId;
    private final Set<Account> accounts = new HashSet<Account>();

    public Customer(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }
}
