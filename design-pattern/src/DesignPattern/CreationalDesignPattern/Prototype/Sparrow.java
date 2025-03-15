package DesignPattern.CreationalDesignPattern.Prototype;

public class Sparrow extends Bird {
    private String walk = "chichichi";
    public Sparrow(){

    }
    public Sparrow(Sparrow sparrow){
        super(sparrow);
        this.walk = sparrow.walk;
    }
    public Sparrow cloneBird(){
        return new Sparrow(this);
    }
}
