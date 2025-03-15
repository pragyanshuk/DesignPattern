package DesignPattern.Behavioural.Strategy.approach2;
//Step2
public class CarPathCalculationStrategy implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Car's Path");
    }
}
