package strategy;

public class SubtractNumbersStrategy implements CalculatorStrategyInterface {
    public double calculate(double x, double y) {
        return x - y;
    }
}
