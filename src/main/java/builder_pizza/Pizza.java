package builder_pizza;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {
    private final String bottom;
    private final String sauce;
    private final List<String> ingredients = new ArrayList<>();

    public Pizza(String bottom, String sauce) {
        this.bottom = bottom;
        this.sauce = sauce;
    }
}
