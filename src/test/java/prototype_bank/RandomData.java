package prototype_bank;

import java.time.LocalDate;
import java.util.Random;

public class RandomData {
    private Random generator = new Random();
    private double randomAmount = (generator.nextDouble());
    private int randomDayOfYear = (generator.nextInt(364) + 1);
    private int randomYear = (generator.nextInt(2) + 2017);

    public LocalDate getRandomDate() {
        LocalDate randomDate = LocalDate.ofYearDay(randomYear, randomDayOfYear);
        return randomDate;
    }

    public double getRandomAmount(){
        return randomAmount * 100;
    }

}
