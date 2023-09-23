package decorator;

public class OrangeCone implements IceCream{
    //orangeCone will behave only as base Cone

    @Override
    public String getDescription() {
        return "orange cone";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
