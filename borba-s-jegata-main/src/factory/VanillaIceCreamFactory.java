package factory;

import model.Cone;
import model.IceCream;
import model.Flavour;

import java.util.List;

public class VanillaIceCreamFactory implements IceCreamFactory {

    @Override
    public IceCream prepareIceCream() {
        return IceCream.iceCreamBuilder()
                .setFlavour(Flavour.VANILLA.getFlavour())
                .setPrice(2.23)
                .setIngredients(List.of("Milk", "Cane Sugar", "Vanilla extract", "Cream"))
                .build();
    }
}
