package patterns.abstractfactory.base;

// Product
public class EuropeShipFeeProcessor extends ShipFeeProcessor {
    public void calculateShipFee(Order order) {
        // insert here Europe specific ship fee calculation
    }
}
