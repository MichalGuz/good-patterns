package factory_shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {
    @Test
    public void testFactoryCircle() {
        // given
        ShapeFactory shapeFactory = new ShapeFactory();

        // when
        Shape shape = shapeFactory.makeShapoe(ShapeFactory.CIRCLE);

        // then
        Assert.assertEquals(Math.PI * Math.pow(10.0, 4.0), shape.getArea(), 0);
        Assert.assertEquals("The circle", shape.getName());
    }
}
