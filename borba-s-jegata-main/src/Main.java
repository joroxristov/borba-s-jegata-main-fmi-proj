import model.IceCream;

import java.util.List;

import static model.Cone.CUP;
import static model.Flavour.*;
import static model.Topping.CHOCOLATE_GLAZE;
import static model.Topping.CHOCOLATE_SPRINKLES;
import static model.Cone.BISCUIT;

public class Main {

    public static void main(String[] args) {
        IceCreamTruck iceCreamTruck = IceCreamTruck.getInstance();
        IceCream chocolateIceCreamWithoutToppingsInCone = iceCreamTruck.sellIceCream(CHOCOLATE, List.of(), BISCUIT);
        IceCream chocolateIceCreamInCup = iceCreamTruck.sellIceCream(CHOCOLATE, List.of(), CUP);
        IceCream strawberryIceCreamWithSprinklesAndGlazeInCone = iceCreamTruck.sellIceCream(STRAWBERRY, List.of(CHOCOLATE_SPRINKLES, CHOCOLATE_GLAZE), BISCUIT);
        IceCream vanillaIceCreamWithGlazeInCup = iceCreamTruck.sellIceCream(VANILLA, List.of(CHOCOLATE_GLAZE), CUP);

        System.out.printf("%-20s%-20s%-50s%n", "Flavour", "Price", "Ingredients");
        System.out.println("--------------------------------------------------------------");

        List.of(chocolateIceCreamWithoutToppingsInCone, strawberryIceCreamWithSprinklesAndGlazeInCone, vanillaIceCreamWithGlazeInCup, chocolateIceCreamInCup)
                .forEach(iceCream -> {
                    System.out.printf("%-20s%-20.2f%-50s%n",
                            iceCream.getFlavour(),
                            iceCream.getPrice(),
                            String.join(", ", iceCream.getIngredients()));
                });
        System.out.println("--------------------------------------------------------------");
    }
}