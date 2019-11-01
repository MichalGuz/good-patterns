package builder_burger;

import java.util.ArrayList;
import java.util.List;

public final class BigBurger {
    private final String bun;
    private final String burgerType;
    private final boolean burgerDouble;
    private List<String> sauce;
    private List<String> ingredients;

    public BigBurger(final String bun, final String burgerType, final boolean burgerDouble, List<String> sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgerType = burgerType;
        this.burgerDouble = burgerDouble;
        this.sauce = new ArrayList<>(sauce);
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public String getBurgerType() {
        return burgerType;
    }

    public boolean isBurgerDouble() {
        return burgerDouble;
    }

    public List<String> getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigBurger{" +
                "bun='" + bun + '\'' +
                ", burgerType='" + burgerType + '\'' +
                ", burgerDouble=" + burgerDouble +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigBurgerBuilder {
        private static String bun;
        private static String burgerType;
        private static boolean burgerDouble;
        private List<String> sauce;
        private List<String> ingredients;

        public BigBurgerBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigBurgerBuilder setBurgerType(String burgerType) {
            this.burgerType = burgerType;
            return this;
        }

        public BigBurgerBuilder setSauce(String chosenSauce) {
            sauce.add(chosenSauce);
            return this;
        }

        public BigBurgerBuilder setIngredients(String chosenIngredient) {
            ingredients.add(chosenIngredient);
            return this;
        }

        public BigBurgerBuilder setBurgerDouble(boolean burgerDouble) {
            BigBurgerBuilder.burgerDouble = burgerDouble;
            return this;
        }

        public BigBurger build() {
            return new BigBurger(bun,burgerType, burgerDouble, sauce, ingredients);
        }
    }
}
