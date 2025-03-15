package DesignPattern.Behavioural.Strategy.approach1;

import DesignPattern.Behavioural.Strategy.TransportMode;

public class GoogleMap {
    public void calculatePath(String from , String to , TransportMode transportMode){
        switch(transportMode){
            case CYCLE:
                System.out.println("Cycle's Path");
            case BIKE:
                System.out.println("Bike's Path");
            case CAR:
                System.out.println("Car's Path");
        }
        throw new RuntimeException("Invalid TransportMode");
    }
}
