package builder_burger;

import org.junit.Test;

import java.io.BufferedReader;

public class BigBurgerTestSuite {
    @Test
    public void testBigBurgerNew() {
        // given
        BigBurger burger1 = new BigBurger.BigBurgerBuilder()
                .setBun("Classic")
                .setBurgerType("Millet groats")
                .setBurgerDouble(false)
                .setSauce("Mustard")
                .setSauce("Spicy tomatoes")
                .setIngredients("Onion")
                .setIngredients("Lettuce")
                .setIngredients("Tomato")
                .setIngredients("Cucumber")
                .setIngredients("Capars")
                .build();

        // when
        int numberOfIngredientsInBurger1 = burger1.getIngredients().size();
        String chosenIngredient = burger1.getIngredients().get(3);
        boolean wasBurgerDoubled = burger1.isBurgerDouble();


    }
}
