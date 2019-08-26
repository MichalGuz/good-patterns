package strategy;

public class MultiplyNumbersStrategy implements CalculatorStrategyInterface {
    public double calculate(double x, double y){
        return x * y;
    }
}
