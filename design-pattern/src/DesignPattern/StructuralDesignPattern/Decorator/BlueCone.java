package DesignPattern.StructuralDesignPattern.Decorator;
//Step 2 - Create Base classes over which our functionality will be added
public class BlueCone implements Icecream{
    private Icecream icecream;
    public BlueCone(Icecream icecream){
        this.icecream = icecream;
    }
    public BlueCone(){

    }
    @Override
    public int getCost() {
        if(icecream == null){
            return 12;
        }
        else{
            return icecream.getCost()+12;
        }
    }

    @Override
    public String getConstituents() {
        if(icecream == null){
            return "BlueCone";
        }
        else{
            return icecream.getConstituents() + "-BlueCone";
        }
    }
}
