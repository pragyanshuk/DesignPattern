package DesignPattern.StructuralDesignPattern.Decorator;
// Step 3 - Add decorator classes which is-a Iceream and also has-a icecream.
public class ChocolateScoop implements Icecream{
    private Icecream icecream;
    public ChocolateScoop(Icecream icecream){
        this.icecream = icecream;
    }
    @Override
    public int getCost() {
        return icecream.getCost() + 25;
    }

    @Override
    public String getConstituents() {
        return icecream.getConstituents() + "-ChocolateScoop";
    }
}
