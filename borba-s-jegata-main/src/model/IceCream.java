package model;

import java.util.List;

public class IceCream {

    protected String flavour;

    protected double price;

    protected List<String> ingredients;

    protected Cone cone;

    public IceCream(String flavour, double price, List<String> ingredients, Cone cone) {
        this.flavour = flavour;
        this.price = price;
        this.ingredients = ingredients;
        this.cone = cone;
    }

    public IceCream() {
    }

    public String getFlavour() {
        return flavour;
    }

    public Cone getCone() {
        return cone;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setCone(Cone cone) {
        this.cone = cone;
    }

    public static IceCreamBuilder iceCreamBuilder() {
        return new IceCreamBuilder();
    }

    public static class IceCreamBuilder {

        private IceCream iceCream;

        public IceCreamBuilder() {
            iceCream = new IceCream();
        }

        public IceCreamBuilder setFlavour(String flavour) {
            iceCream.setFlavour(flavour);
            return this;
        }

        public IceCreamBuilder setPrice(double price) {
            iceCream.setPrice(price);
            return this;
        }

        public IceCreamBuilder setIngredients(List<String> ingredients) {
            iceCream.setIngredients(ingredients);
            return this;
        }

        public IceCreamBuilder setCone(Cone cone) {
            iceCream.setCone(cone);
            return this;
        }

        public IceCream build() {
            return iceCream;
        }
    }
}
