package DesignPattern.CreationalDesignPattern.Factory;
// Step 2 - create concrete classes
public class OldTaxRegime implements TaxCalculatorFactory{
    @Override
    public Double calculateTax(SalaryDetails details) {
        return (0.1*details.getBasicPay() + 0.2*details.getHra());
    }
}
