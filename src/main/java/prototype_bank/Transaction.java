package prototype_bank;

import java.time.LocalDate;

public final class Transaction {
    private final String transactionId;
    private final double transactionAmount;
    private LocalDate transactionDate;

    public Transaction(final String transactionId, final double transactionAmount, final LocalDate transactionDate) {
        this.transactionId = transactionId;
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
    }

    public String getTransactionId(){
        return transactionId;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    @Override
    public String toString() {
        return "     [Transaction ID: " + transactionId + "] |amount| " + transactionAmount + " @ |data| " + transactionDate + ";";
    }
}
