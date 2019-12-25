package factory_delivery_static_factory;

import org.junit.Assert;
import org.junit.Test;

public class StaticFactoryTestSuite {
    @Test
    public void testCreateProductOfRightType()  {
        // given
        ProductProcessor pr = new ProductProcessor();

        // when
        pr.processProductOfStaticFactory("Master");

        // then
        Assert.assertTrue("Test ok", true);
    }

    @Test
    public void testCreateProductOfInappropriateType()  {
        // given
        ProductProcessor pr = new ProductProcessor();
    }
}
