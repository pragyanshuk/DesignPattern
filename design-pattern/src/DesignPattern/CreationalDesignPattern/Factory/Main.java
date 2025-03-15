package DesignPattern.CreationalDesignPattern.Factory;
/*
Factory DP is used when you want to choose from different implementations based on some parameter to create an object.
So basically there is an object which have different implementations , and you want to choose one of it based on the parameter.
For eg Database object can be created of MySql , Postgres or MongoDB type.
Tax is calculated based on two types of regime , new or old.
 */
public class Main {

    public static void main(String[] args){
        TaxCalculator taxCalculator = new TaxCalculator(new NewTaxRegime());
        Double tax = taxCalculator.EvaluateTax(new SalaryDetails());
    }
}
