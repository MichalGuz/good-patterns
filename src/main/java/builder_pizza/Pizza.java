package builder_pizza;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {
    private final String bottom;
    private final String sauce;
    private final List<String> ingredients = new ArrayList<>();

    public static class PizzaBuilder {
        private static String bottom;
        private static String sauce;
        private List<String> ingredients = new ArrayList<>();

        public PizzaBuilder setBottom(String bottom) {
            this.bottom = bottom;
            return this;
        }

        public PizzaBuilder setSauce(String sauce) {
            this.sauce = sauce;
        }

    }

    public Pizza(String bottom, String sauce, String... ingredients) {
        this.bottom = bottom;
        this.sauce = sauce;
        for (int n = 0; n < ingredients.length; n++) {
            this.ingredients.add(ingredients[n]);
        }
    }

    public String getBottom() {
        return bottom;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "bottom='" + bottom + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
