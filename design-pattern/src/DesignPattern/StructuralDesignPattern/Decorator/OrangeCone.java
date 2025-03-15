package DesignPattern.StructuralDesignPattern.Decorator;
//Step 2 - Create Base classes over which our functionality will be added
public class OrangeCone implements Icecream{
    private Icecream icecream;
    public OrangeCone(Icecream icecream){
        this.icecream = icecream;
    }
    public OrangeCone(){

    }
    @Override
    public int getCost() {
        if(icecream == null){
            return 10;
        }
        else{
            return icecream.getCost() + 10;
        }
    }

    @Override
    public String getConstituents() {
        if(icecream == null){
            return "OrangeCone";
        }
        else return icecream.getConstituents() + "-OrangeCone";
    }
}
