package decorator;

public class StrawberryScoop implements IceCream{
    //it will act as an addon
    private IceCream icecream;
    public StrawberryScoop(IceCream icecream){
        this.icecream=icecream;
    }

    @Override
    public String getDescription() {
        if(icecream!=null){
            return icecream.getDescription()+"  strawberry Scoop";
        }
        return null;
    }

    @Override
    public int getCost() {
        if(icecream!=null){
            return icecream.getCost()+ 25;
        }
        return 0;
    }
}
