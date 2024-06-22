package decorator;

import model.Flavour;
import model.IceCream;

import java.util.List;

public class ChocolateSprinklesDecorator extends IceCreamToppingDecorator {

    public ChocolateSprinklesDecorator(IceCream iceCream) {
        super(Flavour.CHOCOLATE.getFlavour(),
                0.68,
                List.of("Cane Sugar", "Cocoa powder", "Coconut oil"),
                iceCream);
    }
}
