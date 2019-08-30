package strategy;

public class ClientCalculatorStrategy {
    public static void main(String[] args) {
        CalculatorContext context = new CalculatorContext();
        double result = 0;

        context.set(new AddNumbersStrategy());
        result = context.processCalculation(8,4);
        System.out.println("Result of add method is: " + result);

        context.set(new SubtractNumbersStrategy());
        result = context.processCalculation(8,4);
        System.out.println("Result of subtract method is: " + result);

        context.set(new MultiplyNumbersStrategy());
        result = context.processCalculation(8,4);
        System.out.println("Result of multiply method is: " + result);

        context.set(new DivideNumbersStrategy());
        result = context.processCalculation(8, 4);
        System.out.println("Result of divide method is " + result);
    }
}
