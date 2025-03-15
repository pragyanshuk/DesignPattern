package DesignPattern.Behavioural.Strategy.approach2;
//Step2
public class CyclePathCalculatorStrategy implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Cycle's Path");
    }
}
