package strategy;

public class CalculatorContext {
    private CalculatorStrategyInterface calculator;

    public void set(CalculatorStrategyInterface calculator){
        this.calculator = calculator;
    }

}
