package strategy_broker;

public class AggressivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] buy stock of MysteriousName Inc";
    }
}
