package DesignPattern.CreationalDesignPattern.Prototype;

public class Bird {
    private int weight;
    private int age;
    private String color;

    public Bird(){

    }
    public Bird(Bird oldBird){
        this.weight = oldBird.weight;
        this.age = oldBird.age;
        this.color = oldBird.color;
    }
    public Bird cloneBird() {
        return null;
    }
//    public  Bird clone(){
//        Bird copyBird = new Bird(this);
//        return copyBird;
//    }
}
