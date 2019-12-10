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
        String description  = order.getDescription();

        // then
        Assert.assertEquals("Selected course with City Taxi network", description);
    }

    @Test
    public void testCyberTaxiGetCostWithChildSeat() {
        // given
        TaxiOrder order = new BasicTaxiOrder();
        order = new CyberTaxiNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);

        // when
        BigDecimal theCost = order.getCost();

        // then
        Assert.assertEquals(new BigDecimal(80), theCost);
    }

    @Test
    public void testCyberTaxiGetDescriptionWithChildSeat() {
        // given
        TaxiOrder order = new BasicTaxiOrder();
        order = new CyberTaxiNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);

        // when
        String descriptiom = order.getDescription();

        // then
        Assert.assertEquals("Selected course with Cyber Taxi network with using a child seat", descriptiom);
    }

    @Test
    public void testCiaoTaxiWithTwoChildSeatsGetCost() {
        // given
        TaxiOrder order = new BasicTaxiOrder();
        order = new CiaoTaxiNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        order = new ChildSeatDecorator(order);

        // when
        BigDecimal cost = order.getCost();

        // then
        Assert.assertEquals(new BigDecimal(70), cost);
    }

    @Test
    public void testCiaoTaxiWithTwoChildSeatsGetDescription() {
        // given
        TaxiOrder order = new BasicTaxiOrder();
        order = new CiaoTaxiNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        order = new ChildSeatDecorator(order);

        // when
        String description = order.getDescription();

        // then
        Assert.assertEquals("Selected course with CiaoTaxi network with using a child seat with using a child seat", description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        // given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new CityTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipCarDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        System.out.println(taxiOrder.getCost());

        // when
        BigDecimal cost = taxiOrder.getCost();


    }
}
