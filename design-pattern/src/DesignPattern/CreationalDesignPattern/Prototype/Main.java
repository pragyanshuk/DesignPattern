package DesignPattern.CreationalDesignPattern.Prototype;

/*
Prototype Design Pattern is used -->
    ## When you want to create clone of an object because creating actual object everytime from the starting is costly.
    ## So you create clone of it and do some modification on top of it.

Prototype Registry is used to store and crate a copy of an object of a class.
 */
public class Main {
    public static void main(String[] args){
        BirdRegistry birdRegistry = new BirdRegistry();
    birdRegistry.registerBird("pigeon", new Pigeon());
    birdRegistry.registerBird("sparrow", new Sparrow());
    birdRegistry.registerBird("crow", new Crow());

        Bird b1 = birdRegistry.getCopy("pigeon");
        Bird b2 = birdRegistry.getCopy("sparrow");
        Bird b3 = birdRegistry.getCopy("crow");
        System.out.println(b1);
    }
}
