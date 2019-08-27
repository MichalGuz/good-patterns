package strategy;

public class ClientCalculatorStrategy {
    public static void main(String[] args) {
        CalculatorContext context = new CalculatorContext();
        double result = 0;

        context.set(new AddNumbersStrategy());
        result = context.processCalculation(8,4);
        System.out.println("Result of add method is: " + result);

    }
}
