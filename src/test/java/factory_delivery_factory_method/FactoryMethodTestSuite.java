package factory_delivery_factory_method;

import org.junit.Test;

public class FactoryMethodTestSuite {
    @Test
    public void testProcessMethod() {
        // given
        AbstractProductProcessor abstractProductProcessor;

        // when
        abstractProductProcessor = new VeniceProductProcess();
        abstractProductProcessor.process("Alpha");

        abstractProductProcessor = new AmsterdamProductProcess();
        abstractProductProcessor.process("Alpha");

        // then
        // do nothing
    }
}