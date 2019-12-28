package factory_delivery_simple_factory;

import org.junit.Assert;
import org.junit.Test;

public class SimpleFactoryTestSuite {
    @Test
    public void testProcessProductOfSimpleFactory() {
        // given
        ProductProcess process = new ProductProcess(new SimpleFactory());

        // when
        // enter right name
        process.processProductOfSimpleFactory("Express");
        // enter wrong name
        process.processProductOfSimpleFactory("Expresss");

        // then
        // do nothing
    }

    @Test
    public void testProcessProductOfSimpleFactoryWithDbSimpleFactory() {
    }
}
