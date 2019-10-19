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

    }
}
