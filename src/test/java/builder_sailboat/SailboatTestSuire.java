package builder_sailboat;

import org.junit.Test;

public class SailboatTestSuire {
    @Test
    public void testSailboatNew() {
        // given
        Sailboat sailboat1 = new Sailboat.SailboatBuilder()
                .setSailboatTyoe("Cutter")
                .setBoatLenght(6)
                .setSailsNumber(2)

    }
}
