package strategy;

public class AddNumbersStrategy implements CalculatorStrategyInterface {
    public double calculate(double x, double y){
        return x + y;
    }
}
