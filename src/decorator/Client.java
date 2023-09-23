package decorator;

public class Client {
    public static void main(String[] args){
        IceCream icecream=
                new ChocoChips(
                    new VanillaScoop(
                        new StrawberryScoop(
                            new ChocolateCone(
                               new OrangeCone()
                            )
                        )
                    )
                );
        System.out.println(icecream.getDescription());
        System.out.println(icecream.getCost());
    }
}
