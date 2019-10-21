package strategy_broker;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {
    @Test
    public void testDefaultInvestingStrategy() {
        // given
        Customer bold = new IndividualYoungCustomer("Adam Young");
        Customer cautious = new IndividualOldCustomer("Ian Older");
        Customer corporate = new CorporateCustomer("Unity Ltd");

        // when
        String boldShouldBuy = bold.predict();
        System.out.println(bold.getName() + " should buy: " +  boldShouldBuy);
        String cautiousShouldBuy = cautious.predict();
        System.out.println(cautious.getName() + " should buy: " + cautiousShouldBuy);
        String corporateShouldBuy = corporate.predict();
        System.out.println(corporate.getName() + " should buy: " + corporateShouldBuy);

        // then
        Assert.assertEquals("[Conservative predictor] buy safe public bonds",cautiousShouldBuy);
        Assert.assertEquals("[Aggressive predictor] buy stock of MysteriousName Inc", boldShouldBuy);
        Assert.assertEquals("[Balanced predictor] buy shared units of Famous-&-Old Fund", corporateShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        // given
        Customer bold  =  new IndividualYoungCustomer("Adam Bold");
    }
}


