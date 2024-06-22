package decorator;

import model.IceCream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public abstract class IceCreamToppingDecorator extends IceCream {

    protected final IceCream iceCream;

    protected IceCreamToppingDecorator(String flavour, double price, List<String> ingredients, IceCream iceCream) {
        super(flavour, price, ingredients, null);
        this.iceCream = iceCream;
    }

    @Override
    public String getFlavour() {
        if (!Objects.isNull(iceCream)) {
            return iceCream.getFlavour();
        } else {
            return "Only topping";
        }
    }

    @Override
    public double getPrice() {
        if (!Objects.isNull(iceCream)) {
            return price + iceCream.getPrice();
        } else {
            return price;
        }
    }

    @Override
    public List<String> getIngredients() {
        if (!Objects.isNull(iceCream)) {
            return Stream.concat(ingredients.stream(), iceCream.getIngredients().stream())
                    .toList();
        } else {
            return ingredients;
        }
    }
}
