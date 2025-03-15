package DesignPattern.Behavioural.Strategy.approach2;
//Step2
public class BikePathCalculationStrategy implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Bike's Path");
    }
}
