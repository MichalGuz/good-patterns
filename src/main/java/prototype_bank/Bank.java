package prototype_bank;

import java.util.ArrayList;
import java.util.List;

public final class Bank {
    private final String bankBranch;
    private final List<Customer> customers = new ArrayList<>();

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

    public Bank shallowCopy() throws CloneNotSupportedException{
        return (Bank)super.clone();
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }
}
