package factory_shape;

public final class Square implements Shape {
    final String name;
    final double width;

    public Square(final String name, final double width) {
        this.name = name;
        this.width = width;
    }

    @Override
    public String getName() {
        return name
    }




}
