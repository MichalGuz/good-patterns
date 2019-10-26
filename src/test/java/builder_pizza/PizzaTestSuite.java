package builder_pizza;

import org.junit.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew() {
        // given
        Pizza pizza = new Pizza("Thin", "Mild", "Mushrooms", "Pepper", "Onion", "Garlic");
        System.out.println(pizza);
    }
}
