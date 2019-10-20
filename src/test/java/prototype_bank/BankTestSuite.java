package prototype_bank;

import org.junit.Test;

import java.util.stream.IntStream;

public class BankTestSuite {
    @Test
    public void testGetTransactions() {
        // given
        Bank bank = new Bank("Bank # 1");

        Account account01 = new Account("12 3456 0000 0000 7890 0000 0001");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> account01.getTransactions().add(new Transaction("transaction 000" + n, new RandomData().getRandomAmount(), new RandomData().getRandomDate())));

        Account account02 = new Account("12 3456 0000 0000 7890 0000 0002");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> account02.getTransactions().add(new Transaction("transaction 001" + n, new RandomData().getRandomAmount(), new RandomData().getRandomDate())));

        Account account03 = new Account("12 3456 0000 0000 7890 0000 0003");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> account03.getTransactions().add(new Transaction("transaction 002" + n, new RandomData().getRandomAmount(), new RandomData().getRandomDate())));

        Account account04 = new Account("12 3456 0000 0000 7890 0000 0004");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> account04.getTransactions().add(new Transaction("transaction 003" + n, new RandomData().getRandomAmount(), new RandomData().getRandomDate())));

        Account account05 = new Account("12 3456 0000 0000 7890 0000 0005");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> account05.getTransactions().add(new Transaction("transaction 004" + n, new RandomData().getRandomAmount(), new RandomData().getRandomDate())));

        Customer customer1 = new Customer("Customer 1");
        customer1.getAccounts().add(account01);
        customer1.getAccounts().add(account02);

        Customer customer2 = new Customer("Customer 2");
        customer2.getAccounts().add(account03);
        customer2.getAccounts().add(account04);

        Customer customer3 = new Customer("Customer 3");
        customer3.getAccounts().add(account05);

        bank.getCustomers().add(customer1);
        bank.getCustomers().add(customer2);
        bank.getCustomers().add(customer3);

        // when
        System.out.println(bank);

        // making the shallow copy of bank object
        Bank clonedBank = null;


        // then
    }
}
