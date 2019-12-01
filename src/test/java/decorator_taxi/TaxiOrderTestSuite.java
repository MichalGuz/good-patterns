package decorator_taxi;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost() {
        // given
        TaxiOrder order = new BasicTaxiOrder();

        // when
        BigDecimal calculatedCost = order.getCost();

        // then
        Assert.assertEquals(new BigDecimal(10), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        // given
        TaxiOrder order = new BasicTaxiOrder();

        // when
        String description = order.getDescription();

        // then
        Assert.assertEquals("Selected course", description);
    }
}
