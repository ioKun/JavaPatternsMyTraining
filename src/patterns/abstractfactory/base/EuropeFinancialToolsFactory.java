package patterns.abstractfactory.base;

public class EuropeFinancialToolsFactory extends FinancialToolsFactory {
    public TaxProcessor createTaxProcessor() {
        return new EuropeTaxProcessor();
    }
    public ShipFeeProcessor createShipFeeProcessor() {
        return new EuropeShipFeeProcessor();
    }
}
