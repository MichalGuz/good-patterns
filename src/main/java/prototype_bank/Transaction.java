package prototype_bank;

import java.time.LocalDate;

public final class Transaction {
    private final String transactionId;
    private final int transactionAmount;
    private LocalDate transactionDate;

    public Transaction(final String transactionId, final int transactionAmount, int year, int month, int day) {
        this.transactionId = transactionId;
        this.transactionAmount = transactionAmount;
        this.transactionDate = LocalDate.of(year, month, day);
    }
}
