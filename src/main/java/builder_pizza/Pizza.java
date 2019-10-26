package builder_pizza;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {
    private final String bottom;
    private final String sauce;
    private final List<String> ingredients = new ArrayList<>();

    public Pizza(String bottom, String sauce, String... ingredients) {
        this.bottom = bottom;
        this.sauce = sauce;
        for (int n = 0; n < ingredients.length; n++) {
            this.ingredients.add(ingredients[n]);
        }
    }
}
