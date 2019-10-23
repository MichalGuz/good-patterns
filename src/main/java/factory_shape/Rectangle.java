package factory_shape;

public final class Rectangle implements Shape {
    final String name;
    final double width;
    final double lenght;

    public Rectangle(String name, double width, double lenght) {
        this.name = name;
        this.width = width;
        this.lenght = lenght;
    }
}
