package DesignPattern.CreationalDesignPattern.Factory;

public class TaxCalculator {
   private TaxCalculatorFactory taxCalculatorFactory;
   public TaxCalculator(TaxCalculatorFactory taxCalculatorFactory){
       this.taxCalculatorFactory = taxCalculatorFactory;
   }
   public Double EvaluateTax(SalaryDetails details){
       return taxCalculatorFactory.calculateTax(details);
   }
}
