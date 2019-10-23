package factory_shape;

public final class Circle implements Shape {
    final String name;
    final double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName(){
        return name;
    }
}
