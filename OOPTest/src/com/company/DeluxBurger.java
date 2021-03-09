package com.company;

public class DeluxBurger extends Hamburger {
    public DeluxBurger() {
        super("deluxe", "sausage and bacon", 10.25, "white");
        super.addHamburgerAddition1("chips",2.44);
        super.addHamburgerAddition2("drink",3.10);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add items to a deluxe burger");
    }
}
