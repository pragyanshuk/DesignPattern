package DesignPattern.Behavioural.Strategy.approach2;

import DesignPattern.Behavioural.Strategy.TransportMode;

public class Main {
    public static void main(String[] args){
        PathCalculatorFactory pathCalculatorFactory = new PathCalculatorFactory();
        pathCalculatorFactory.getTransport(TransportMode.CYCLE).findPath("Mumbai","Delhi");
    }
}
