package DesignPattern.CreationalDesignPattern.Factory;

//Step-2 Create concrete classes
public class NewTaxRegime implements TaxCalculatorFactory{
    @Override
    public Double calculateTax(SalaryDetails details) {
        return (0.3*details.getBasicPay() + 0.1*details.getHra());
    }
}
