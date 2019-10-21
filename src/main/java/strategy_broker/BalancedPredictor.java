package strategy_broker;

public class BalancedPredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] buy shared units of Famous-&-Old Fund";
    }
}
