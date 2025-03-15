package DesignPattern.CreationalDesignPattern.Prototype;

public class Pigeon extends Bird {
    private String sound = "hooooohoooo";

    public Pigeon(){

    }
    public Pigeon(Pigeon oldPigeon){
        super(oldPigeon); // copying bird attributes inside pigeon
        this.sound = oldPigeon.sound;
    }
    public Pigeon cloneBird(){
        return new Pigeon(this);
    }
}
