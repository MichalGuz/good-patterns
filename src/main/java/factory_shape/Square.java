package factory_shape;

public final class Square implements Shape {
    final String name;
    final double width;

    public Square(String name, double width) {
        this.name = name;
        this.width = width;
    }
}
