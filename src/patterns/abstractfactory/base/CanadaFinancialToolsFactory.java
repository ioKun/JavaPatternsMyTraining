package patterns.abstractfactory.base;

public class CanadaFinancialToolsFactory {
    public TaxProcessor createTaxProcessor() {
        return new CanadaTaxProcessor();
    }
    public ShipFeeProcessor createShipFeeProcessor() {
        return new CanadaShipFeeProcessor();
    }
}
