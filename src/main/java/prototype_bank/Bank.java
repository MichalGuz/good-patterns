package prototype_bank;

import java.util.ArrayList;
import java.util.List;

public final class Bank extends PrototypeBank {
    private String bankBranch;
    private List<Customer> customers = new ArrayList<>();

    public Bank(final String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        String s = "Bank [ " + bankBranch + " ]";
        for (Customer c : customers) {
            s = s + c.toString();
        }
        return s;
    }

    public Bank shallowCopy() throws CloneNotSupportedException {
        return (Bank)super.clone();
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public Bank deepCopy() throws CloneNotSupportedException {
        Bank deepClonedBank = (Bank)super.clone();
        deepClonedBank.customers = new ArrayList<>();
        for(Customer c: customers) {
            Customer deepClonedCustomer = new Customer(c.getCustomerId());
            for(Account a: c.getAccounts()) {
                Account deepClonedAccount = new Account(a.getName());
                for(Transaction t: a.getTransactions()) {
                    Transaction deepClonedTransaction = new Transaction(t.getTransactionId(), t.getTransactionAmount(), t.getTransactionDate());
                    deepClonedAccount.getTransactions().add(t);
                }
                deepClonedCustomer.getAccounts().add(deepClonedAccount);
            }
            deepClonedBank.getCustomers().add(deepClonedCustomer);
        }
        return deepClonedBank;
    }
}
