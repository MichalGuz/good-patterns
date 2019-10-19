package prototype_bank;

import java.time.LocalDate;

public final class Transaction {
    private final String transactionId;
    private final int transcationAmount;
    private LocalDate transactionDate;

    public Transaction(final String transactionId, final int transcationAmount, int year, int month, int day) {
        this.transactionId = transactionId;
        this.transcationAmount = transcationAmount;
        this.transactionDate = LocalDate.of(year, month, day);
    }
}
