package com.company;



public class Main {

    public static void main(String[] args) {

        Hamburger hamburger=new Hamburger("Basic","sausage",5.56,"white");
        double price= hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato",2.37);
        hamburger.addHamburgerAddition2("lettuce",3.31);
        hamburger.addHamburgerAddition3("cheese",1.39);
        System.out.println("Total: "+hamburger.itemizeHamburger());


        HealthyBurger healthyBurger=new HealthyBurger("bacon",5.99);
        healthyBurger.addHamburgerAddition1("egg",2.71);
        healthyBurger.addHealthAddition1("Carrots",3.50);
        System.out.println("Total healthy burger: "+healthyBurger.itemizeHamburger());

        DeluxBurger deluxBurger=new DeluxBurger();
        deluxBurger.addHamburgerAddition1("Olives",3.00);
        deluxBurger.itemizeHamburger();


    }
}
