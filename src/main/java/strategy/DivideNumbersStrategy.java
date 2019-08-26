package strategy;

public class DivideNumbersStrategy implements CalculatorStrategyInterface {
    public double calculate(double x, double y) {
        return x / y;
    }
}
