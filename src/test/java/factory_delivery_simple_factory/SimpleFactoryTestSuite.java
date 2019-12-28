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
        // given
        DbSimpleFactory dbSimpleFactory = new DbSimpleFactory("Connection");
        ProductProcess process = new ProductProcess(dbSimpleFactory);

        // when
        // enter right name
        process.processProductOfSimpleFactory("Express");
        // enter wrong name
        process.processProductOfSimpleFactory("Expressss");
        String connectionsName = dbSimpleFactory.getDbConnection();

        // then
        Assert.assertEquals("Connection", connectionsName);
    }
}
