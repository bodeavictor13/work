package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions=new Dimensions(20,20,5);
        Case theCase=new Case("ab58","HP","240",dimensions);
        Monitor monitor=new Monitor("27inch Beat","Acer",27,new Resolution(2540,1440));

        Motherboard motherboard=new Motherboard("BS500","Asus",4,6,"v2.55");
        PC pc=new PC(theCase,monitor,motherboard);
//        pc.getMonitor().drawPixelAt(5000,1200,"red");
//        pc.getMotherboard().loadProgram("Windows 1.0");
//        pc.getTheCase().pressPowerButton();
        pc.powerUp();


        //CHALLANGE

//        Wall wall1=new Wall("west");
//        Wall wall2=new Wall("east");
//        Wall wall3=new Wall("north");
//        Wall wall4=new Wall("south");
//        Ceiling ceiling=new Ceiling(12,55);
//        Bed bed=new Bed("modern",2,3,1,1);
//        Lamp lamp=new Lamp("classic",false, 75);
//
//        Bedroom bedroom=new Bedroom("mine",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
//        bedroom.makeBed();
//        bedroom.getLamp().turnOn();
    }
}
