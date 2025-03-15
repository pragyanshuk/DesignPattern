package DesignPattern.Behavioural.Strategy.approach2;

import DesignPattern.Behavioural.Strategy.TransportMode;

public class PathCalculatorFactory {
    public PathCalculatorStrategy getTransport(TransportMode transportMode){
        switch(transportMode){
            case CYCLE:
                return new CyclePathCalculatorStrategy();
            case BIKE:
                return new BikePathCalculationStrategy();
            case CAR:
                return new CarPathCalculationStrategy();
        }
        throw new RuntimeException("Invalid TransportMode");
    }
}
