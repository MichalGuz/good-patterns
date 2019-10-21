package strategy_calculator;

public class SubtractNumbersStrategy implements CalculatorStrategyInterface {
    public double calculate(double x, double y) {
        return x - y;
    }
}
