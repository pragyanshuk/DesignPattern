package DesignPattern.StructuralDesignPattern.Decorator;
// Step 3 - Add decorator classes which is-a Iceream and also has-a icecream.
public class VanilaScoop implements Icecream{
    private Icecream icecream;
    public VanilaScoop(Icecream icecream){
        this.icecream = icecream;
    }
    @Override
    public int getCost() {
        return icecream.getCost() + 20;
    }

    @Override
    public String getConstituents() {
        return icecream.getConstituents() + "-VanilaScoop" ;
    }
}
