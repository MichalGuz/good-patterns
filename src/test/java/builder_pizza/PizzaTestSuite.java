package builder_pizza;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew() {
        // given
        Pizza pizza = new Pizza.PizzaBuilder()
                .setIngredient("Garlic")
                .setBottom("Thin")
                .setIngredient("Onion")
                .setSauce("Mild")
                .setIngredient("Pepper")
                .setIngredient("Mushrooms")
                .build();

        Pizza pizzaOnlyWithSauce = new Pizza.PizzaBuilder()
                .setBottom("Thin")
                .setSauce("Mild")
                .build();

        System.out.println(pizza);
        System.out.println(pizzaOnlyWithSauce);

        // when
        int howManyIngredients = pizza.getIngredients().size();

        // then
        Assert.assertEquals(4, howManyIngredients);
    }
}
