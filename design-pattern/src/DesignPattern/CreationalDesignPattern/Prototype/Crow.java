package DesignPattern.CreationalDesignPattern.Prototype;

public class Crow extends Bird{
    private int length = 10;
    public Crow(){

    }
    public Crow(Crow crow){
        super(crow);
        this.length = crow.length;
    }

    public Crow cloneBird(){
        return new Crow(this);
    }
}
