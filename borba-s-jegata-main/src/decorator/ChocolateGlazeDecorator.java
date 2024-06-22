package decorator;

import model.Flavour;
import model.IceCream;

import java.util.List;

public class ChocolateGlazeDecorator extends IceCreamToppingDecorator {

    public ChocolateGlazeDecorator(IceCream iceCream) {
        super(Flavour.CHOCOLATE.getFlavour(),
                0.10,
                List.of("Cane Sugar", "Cocoa powder", "Full Fat Milk"),
                iceCream);
    }
}
