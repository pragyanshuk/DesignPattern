package DesignPattern.StructuralDesignPattern.Decorator;
/*
It is used when u have to add multiple functionality over existing functionality in any order possible
Eg - PizzaOrderSystem , CarOrder , IceCreamCone etc.
 */
public class Main {
    public static void main(String[] args){
        //Order1 - chocobar --> BlueCone + OrangeCone + ChocoScoop
        //Order2 - vanilabar --> OrangeCone + VanilaScoop + ChocolateScoop

        Icecream chocobar = new ChocolateScoop(new OrangeCone(new BlueCone()));
        int x = chocobar.getCost();
        System.out.println(chocobar.getCost());
        System.out.println(chocobar.getConstituents());

        Icecream vanilabar = new ChocolateScoop(new VanilaScoop(new OrangeCone()));
        System.out.println(vanilabar.getCost());
        System.out.println(vanilabar.getConstituents());
    }
}
