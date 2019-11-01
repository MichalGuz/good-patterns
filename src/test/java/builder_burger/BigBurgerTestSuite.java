package builder_burger;

import org.junit.Assert;
import org.junit.Test;

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
                .setIngredients("Capers")
                .build();

        BigBurger burger2= new BigBurger.BigBurgerBuilder()
                .setBun("Dark")
                .setBurgerType("Beetroot")
                .setBurgerDouble(true)
                .setIngredients("Goat cheese")
                .setIngredients("Onion")
                .setIngredients("Nuts")
                .setIngredients("Rocket")
                .build();

        // when
        int numberOfIngredientsInBurger1 = burger1.getIngredients().size();
        String chosenIngredient = burger1.getIngredients().get(3);
        boolean wasBurgerDoubled = burger1.isBurgerDouble();

        int numberOfIngredientsInBurger2 = burger2.getIngredients().size();
        String chosenIngredient2 = burger2.getIngredients().get(1);
        boolean wasBurger2Doubled = burger2.isBurgerDouble();

        // then
        Assert.assertEquals(numberOfIngredientsInBurger1, 5);
        Assert.assertEquals("Cucumber", chosenIngredient);
        Assert.assertEquals(false, wasBurgerDoubled);
        System.out.println(burger1);

        Assert.assertEquals(numberOfIngredientsInBurger2, 4);
        Assert.assertEquals("Onion", chosenIngredient2);
        Assert.assertEquals(true, wasBurger2Doubled);
        Assert.assertTrue("Burger2 was ordered without sauces.", burger2.getSauce().size() == 0);
        Assert.assertEquals(burger1.getIngredients().get(0), chosenIngredient2);
        System.out.println(burger2);
    }
}
