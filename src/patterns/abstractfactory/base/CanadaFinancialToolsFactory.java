package patterns.abstractfactory.base;

public class CanadaFinancialToolsFactory extends FinancialToolsFactory  {
    public TaxProcessor createTaxProcessor() {
        return new CanadaTaxProcessor();
    }
    public ShipFeeProcessor createShipFeeProcessor() {
        return new CanadaShipFeeProcessor();
    }
}
