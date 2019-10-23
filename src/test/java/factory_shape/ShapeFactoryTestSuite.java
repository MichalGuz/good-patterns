package factory_shape;

import org.junit.Test;

public class ShapeFactoryTestSuite {
    @Test
    public void testFactoryCircle() {
        // given
        ShapeFactory shapeFactory = new ShapeFactory();

        // when
        Shape shape = shapeFactory.makeShapoe(ShapeFactory.CIRCLE);
    }
}
