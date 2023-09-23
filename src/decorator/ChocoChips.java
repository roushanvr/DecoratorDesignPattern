package decorator;

public class ChocoChips implements IceCream{
    //it will act as only addon
    private IceCream icecream;
    public ChocoChips (IceCream icecream){
        this.icecream=icecream;
    }
    @Override
    public int getCost() {
        if(icecream!=null){//Always check for NPE
            return icecream.getCost()+20;
        }
        return 0;//invalid
    }

    @Override
    public String getDescription() {
        if(icecream!=null){
            return icecream.getDescription()+"  choco chips";
        }
        return null;
    }
}
