package factory_delivery_simple_factory;

import org.junit.Test;

public class SimpleFactoryTestSuite {
    @Test
    public void testProcessProductOfSimpleFactory() {
        // given
        ProductProcess process = new ProductProcess(new SimpleFactory());
    }
}
