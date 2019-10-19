package prototype_bank;

import java.util.ArrayList;
import java.util.List;

public final class OperationsList {
    private final String name;
    private final List<Transaction> transactions = new ArrayList<>();

    public OperationsList(final String name) {
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
        String s = "  List [ " + name + " ]";
        for (Transaction t: transactions) {
            s = s + "\n" + transactions.toString();
        }
        return s;
    }
}
