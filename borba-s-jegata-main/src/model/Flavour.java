package model;

public enum Flavour {

    CHOCOLATE("chocolate"),
    VANILLA("vanilla"),
    STRAWBERRY("strawberry");


    private final String flavour;

    Flavour(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }
}