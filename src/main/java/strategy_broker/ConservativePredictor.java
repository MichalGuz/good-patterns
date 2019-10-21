package strategy_broker;

public class ConservativePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] buy safe public bonds";
    }
}
