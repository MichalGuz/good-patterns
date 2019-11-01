package builder_burger;

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
        this.sauce = sauce;
        this.ingredients = ingredients;
    }
}
