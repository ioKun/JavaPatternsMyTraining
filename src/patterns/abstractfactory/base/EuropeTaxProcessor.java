package patterns.abstractfactory.base;

public class EuropeTaxProcessor extends TaxProcessor {
    public void calculateTaxes(Order order) {
        // insert here Europe specific tax calculation
    }
}
