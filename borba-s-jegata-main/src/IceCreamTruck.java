import decorator.ChocolateGlazeDecorator;
import decorator.ChocolateSprinklesDecorator;
import decorator.IceCreamToppingDecorator;
import factory.AbstractIceCreamFactory;
import model.Flavour;
import model.IceCream;
import model.Topping;
import model.Cone;

import java.util.List;
import java.util.Objects;

public final class IceCreamTruck {

    private static IceCreamTruck iceCreamTruck;

    public static IceCreamTruck getInstance() {
        if (Objects.isNull(iceCreamTruck)) {
            iceCreamTruck = new IceCreamTruck();
        }
        return iceCreamTruck;
    }

    private final AbstractIceCreamFactory abstractIceCreamFactory = AbstractIceCreamFactory.getInstance();

    private IceCreamTruck() {
    }

    public IceCream sellIceCream(Flavour flavour, List<Topping> toppings, Cone biscuit) {
        IceCream iceCream = abstractIceCreamFactory.prepareIceCream(flavour);
        addCone(biscuit, iceCream);
        return addToppings(toppings, iceCream);

    }

    private IceCream addToppings(List<Topping> toppings, IceCream iceCream) {
        if (toppings.isEmpty()) {
            return iceCream;
        } else {
            return constructToppingDecorator(toppings, iceCream);
        }
    }

    private void addCone(Cone cone, IceCream iceCream) {
        iceCream.setCone(cone);
    }

    private IceCream constructToppingDecorator(List<Topping> toppings, IceCream iceCream) {
        IceCreamToppingDecorator iceCreamToppingDecorator = null;
        for (int i = 0; i < toppings.size(); i++) {
            if (i == 0) {
                iceCreamToppingDecorator = constructToppingDecorator(toppings.get(i), iceCream);
            } else {
                iceCreamToppingDecorator = constructToppingDecorator(toppings.get(i), iceCreamToppingDecorator);
            }
        }
        return iceCreamToppingDecorator;
    }

    private IceCreamToppingDecorator constructToppingDecorator(Topping topping, IceCream iceCream) {
        return switch (topping) {
            case CHOCOLATE_GLAZE -> new ChocolateGlazeDecorator(iceCream);
            case CHOCOLATE_SPRINKLES -> new ChocolateSprinklesDecorator(iceCream);
        };
    }
}
