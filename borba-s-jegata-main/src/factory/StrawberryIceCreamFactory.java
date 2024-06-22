package factory;

import model.Cone;
import model.IceCream;
import model.Flavour;

import java.util.List;

public class StrawberryIceCreamFactory implements IceCreamFactory {

    @Override
    public IceCream prepareIceCream() {
        return IceCream.iceCreamBuilder()
                .setFlavour(Flavour.STRAWBERRY.getFlavour())
                .setPrice(2.35)
                .setIngredients(List.of("Milk", "Cane Sugar", "Cream", "Strawberries"))
                .build();
    }
}
