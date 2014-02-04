package patterns.abstractfactory.base;

// Client
public class OrderProcessor {
    private TaxProcessor taxProcessor;
    private ShipFeeProcessor shipFeeProcessor;

    public OrderProcessor(FinancialToolsFactory factory) {
        taxProcessor = factory.createTaxProcessor();
        shipFeeProcessor = factory.createShipFeeProcessor();
    }
    public void processOrder (Order order) {
        // ....
        taxProcessor.calculateTaxes(order);
        shipFeeProcessor.calculateShipFee(order);
        // ....
    }
}
