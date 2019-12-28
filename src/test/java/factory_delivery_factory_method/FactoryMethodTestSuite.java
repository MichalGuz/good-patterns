package factory_delivery_factory_method;

import factory_delivery_basic_non_factory.Product;
import org.junit.Test;

public class FactoryMethodTestSuite {
    @Test
    public void testProcessMethod() {
        // given
        AbstractProductProcessor abstractProductProcessor;

        // when
        abstractProductProcessor = new VeniceProductProcess();
        abstractProductProcessor.createProduct("Alpha");
    }
}