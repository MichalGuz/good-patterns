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


    @Test
    public void testCityTaxiNetworkGetCost() {
        // given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new CityTaxiNetworkOrderDecorator(taxiOrder);

        // when
        BigDecimal theCost = taxiOrder.getCost();

        // then
        Assert.assertEquals(new BigDecimal(50), theCost);
    }

    @Test
    public void testCityTaxiNetworkGetDescription() {
        // given
        TaxiOrder order = new BasicTaxiOrder();
        order = new CityTaxiNetworkOrderDecorator(order);

        // when
        String decription  = order.getDescription();

        // then
        Assert.assertEquals(with CityTaxi network");
    }
}
