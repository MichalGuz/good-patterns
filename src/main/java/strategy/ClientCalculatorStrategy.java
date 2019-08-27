package strategy;

public class ClientCalculatorStrategy {
    public static void main(String[] args) {
        CalculatorContext context = new CalculatorContext();
        double result = 0;

        context.set(new AddNumbersStrategy());
     }
}
