package patterns.abstractfactory.base;

public abstract class FinancialToolsFactory {
    public abstract TaxProcessor createTaxProcessor();
    public abstract ShipFeeProcessor createShipFeeProcessor();
}
