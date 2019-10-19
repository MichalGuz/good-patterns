package prototype_bank;

import java.util.ArrayList;
import java.util.List;

public final class Account {
    private final String name;
    private final List<Transaction> transactions = new ArrayList<>();

    public Account(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        String s = "  Account #[ " + name + " ]";
        for (Transaction t: transactions) {
            s = s + "\n" + t.toString();
        }
        return s;
    }
}
