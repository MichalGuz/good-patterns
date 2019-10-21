package strategy_calculator;

public class CalculatorContext {
    private CalculatorStrategyInterface calculator;

    public void set(CalculatorStrategyInterface calculator){
        this.calculator = calculator;
    }

    public double processCalculation(double x, double y){
        double result = calculator.calculate(x,y);
        return result;
    }
}
