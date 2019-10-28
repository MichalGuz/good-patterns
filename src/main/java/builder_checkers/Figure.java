package builder_checkers;

public class Figure {
    public static final String WHITE = "WHITE";
    public static final String BLACK= "BLACK";
    private final String color;

    public Figure(String color) {
        if (color.equals(WHITE) || color.equals(BLACK)) {
            this.color = color;
        }
    }
}
