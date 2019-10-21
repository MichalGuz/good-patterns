package strategy_broker;

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
    }
}


