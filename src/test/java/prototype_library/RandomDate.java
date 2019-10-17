package prototype_library;

import java.time.LocalDate;
import java.util.Random;

public class RandomDate {
    private Random generator = new Random();
    private int randomDayOfYear = generator.nextInt(364);
    private int randomYear = (generator.nextInt(119) + 1900);

    public LocalDate getRandomDate() {
        LocalDate randomDate = LocalDate.ofYearDay(randomYear, randomDayOfYear);
        return randomDate;
    }
}
