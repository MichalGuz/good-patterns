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
        Assert.assertEquals(Math.PI * Math.pow(10.0, 4.0), shape.getArea(), 0);
        Assert.assertEquals("The circle", shape.getName());
    }

    @Test
    public void testFactorySquare() {
        // given
        ShapeFactory shapeFactory = new ShapeFactory();

        // when
        Shape shape = shapeFactory.makeShape(shapeFactory.SQUARE);

        // then
        Assert.assertEquals( 28, shape.getArea(), 0);
        Assert.assertEquals("The square", shape.getName());
    }

    @Test
    public void testFactoryRectangle() {
        // given
        ShapeFactory shapeFactory = new ShapeFactory();

        // when
        Shape shape = shapeFactory.makeShape(shapeFactory.RECTANGLE);




    }

}
