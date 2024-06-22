package factory;

import model.IceCream;
import model.Flavour;

import java.util.Objects;

public final class AbstractIceCreamFactory {

    private static AbstractIceCreamFactory abstractIceCreamFactory;

    public static AbstractIceCreamFactory getInstance() {
        if (Objects.isNull(abstractIceCreamFactory)) {
            abstractIceCreamFactory = new AbstractIceCreamFactory();
        }
        return abstractIceCreamFactory;
    }

    private final IceCreamFactory chocolateIceCreamFactory = new ChocolateIceCreamFactory();

    private final StrawberryIceCreamFactory strawberryIceCreamFactory = new StrawberryIceCreamFactory();

    private final VanillaIceCreamFactory vanillaIceCreamFactory = new VanillaIceCreamFactory();

    public IceCream prepareIceCream(Flavour flavour) {
        return switch (flavour) {
            case CHOCOLATE -> chocolateIceCreamFactory.prepareIceCream();
            case STRAWBERRY -> strawberryIceCreamFactory.prepareIceCream();
            case VANILLA -> vanillaIceCreamFactory.prepareIceCream();
        };
    }

    private AbstractIceCreamFactory() {

    }
}
