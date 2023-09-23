package decorator;

public class ChocolateCone implements IceCream{
    //chocolateCone can behave as base cone as well as addon
    private IceCream icecream;
   //when it acts as base cone
    public ChocolateCone(){

    }
   //when it acts as an addon
    public ChocolateCone(IceCream icecream){
      this.icecream=icecream;
    }
    @Override
    public int getCost() {
        if(icecream!=null){
            return icecream.getCost()+ 15;
        }
       return 15;
    }

    @Override
    public String getDescription() {
      if(icecream!=null){
          return icecream.getDescription()+"  chocolate cone";
      }
      return "chocolate cone";
    }
}
