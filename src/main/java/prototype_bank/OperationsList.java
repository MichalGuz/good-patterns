package prototype_bank;

import java.util.ArrayList;
import java.util.List;

public final class OperationsList {
    private final String name;
    private final List<Transaction> transactions = new ArrayList<>();

    public OperationsList(final String name) {
        this.name = name;
    }
}
