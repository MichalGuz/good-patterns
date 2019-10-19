package prototype_bank;

import java.time.LocalDate;

public final class Transaction {
    private final String transactionId;
    private final int transcationAmount;
    private final LocalDate transactionDate;

    public Transaction(final String transactionId, final int transcationAmount, final LocalDate transactionDate) {
        this.transactionId = transactionId;
        this.transcationAmount = transcationAmount;
        this.transactionDate = transactionDate;
    }
}
