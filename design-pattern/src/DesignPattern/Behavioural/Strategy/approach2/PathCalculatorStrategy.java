package DesignPattern.Behavioural.Strategy.approach2;
//Step1 - Create an interface which have a behaviour , in this case behaviour is findPath() and it has multiple variants.
public interface PathCalculatorStrategy {
    public void findPath(String from , String to);
}
