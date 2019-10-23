package factory_shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {
    @Test
    public void testFactoryCircle() {
        // given
        ShapeFactory shapeFactory = new ShapeFactory();

        // when
        Shape shape = shapeFactory.makeShape(ShapeFactory.CIRCLE);

        // then
        Assert.assertEquals(Math.PI * Math.pow(4.5, 2.0), shape.getArea(), 0);
        Assert.assertEquals("The circle", shape.getName());
    }

    @Test
    public void testFactorySquare() {
        // given
        ShapeFactory shapeFactory = new ShapeFactory();

        // when
        Shape shape = shapeFactory.makeShape(shapeFactory.SQUARE);

        // then
        Assert.assertEquals( 36, shape.getArea(), 0);
        Assert.assertEquals("The square.", shape.getName());
    }

    @Test
    public void testFactoryRectangle() {
        // given
        ShapeFactory shapeFactory = new ShapeFactory();

        // when
        Shape shape = shapeFactory.makeShape(shapeFactory.RECTANGLE);

        // then
        Assert.assertEquals(40, shape.getArea(), 0);
        Assert.assertEquals("The rectangle", shape.getName());
    }

}
