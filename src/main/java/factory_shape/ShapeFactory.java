package factory_shape;

public final class ShapeFactory {
    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    public final Shape makeShapoe(final String shapeClass) {
        switch (shapeClass) {
            case CIRCLE:
                return new Circle("The circle", 4.5);
            case SQUARE:
                return new Square("The square.", 6.0);
            case RECTANGLE:
                return new Rectangle("The rectangle", 10, 4);
            default:
                return  null;
        }
    }
}
