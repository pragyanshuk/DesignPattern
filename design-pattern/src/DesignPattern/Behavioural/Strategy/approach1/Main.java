package DesignPattern.Behavioural.Strategy.approach1;

import DesignPattern.Behavioural.Strategy.TransportMode;

public class Main {
    public static void main(String[] args){
        GoogleMap googleMap = new GoogleMap();
        googleMap.calculatePath("Mumbai","Delhi", TransportMode.CAR);
    }
}
