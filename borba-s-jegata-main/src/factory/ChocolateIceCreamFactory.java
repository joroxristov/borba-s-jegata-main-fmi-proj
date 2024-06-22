package factory;

import model.Flavour;
import model.IceCream;

import java.util.List;

public class ChocolateIceCreamFactory implements IceCreamFactory {

    @Override
    public IceCream prepareIceCream() {
        return IceCream.iceCreamBuilder()
                .setFlavour(Flavour.CHOCOLATE.getFlavour())
                .setPrice(2.23)
                .setIngredients(List.of("Milk", "Cocoa powder", "Sugar", "Chocolate syrup"))
                .build();
    }
}
