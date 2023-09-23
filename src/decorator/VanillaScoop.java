package decorator;

public class VanillaScoop implements IceCream{
    //it will act as an addon
    private IceCream icecream;
    public VanillaScoop(IceCream icecream){
        this.icecream=icecream;
    }

    @Override
    public String getDescription() {
        if(icecream!=null){
            return icecream.getDescription()+"  vanilla scoop";
        }
        return null;
    }

    @Override
    public int getCost() {
        if(icecream!=null){
            return icecream.getCost()+ 30;
        }
        return 0;
    }
}
