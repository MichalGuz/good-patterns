package strategy_calculator;

public class CalculatorToTransform {
    public double calculate(double x, double y, String operator) {
        double result = 0;
        if("add".equals(operator)){
            result = x + y;
        } else if ("subtract".equals(operator)){
            result = x  + y;
        } else if ("multiply".equals(operator)){
            result = x * y;
        } else if("divide".equals(operator)){
            result = x / y;
        }
        return result;
    }
}
