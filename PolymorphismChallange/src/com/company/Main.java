package com.company;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine=true;
        this.wheels=4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){

        return "Car -> engine started";
    }
    public String accelerate(){

        return "Car -> accelerating";
    }
    public String brake(){

        return "Car -> braking";
    }
}

class Hyundai extends Car{

    public Hyundai(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Hyundai -> engine started";
    }

    @Override
    public String accelerate() {
        return "Hyundai -> accelerating";
    }

    @Override
    public String brake() {
        return "Hyundai -> braking";
    }
}

 class Dacia extends Car{

    public Dacia(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Dacia -> engine started";
    }

    @Override
    public String accelerate() {
        return "Dacia-> accelerating";
    }

    @Override
    public String brake() {
        return "Dacia -> braking";
    }
}

 class AlfaRomeo extends Car{

    public AlfaRomeo(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Alfa-> engine started";
    }

    @Override
    public String accelerate() {
        return "Alfa -> accelerating";
    }

    @Override
    public String brake() {
        return "Alfa -> braking";
    }
}


public class Main {

    public static void main(String[] args) {
        Car car=new Car("Base car",8);
        System.out.println(car.startEngine());
        System.out.println( car.accelerate());
        System.out.println( car.brake());

        Hyundai hyundai=new Hyundai("Tucson",4);
        System.out.println(hyundai.startEngine());
        System.out.println( hyundai.accelerate());
        System.out.println( hyundai.brake());

        AlfaRomeo alfa=new AlfaRomeo("Giulia",6);
        System.out.println(alfa.startEngine());
        System.out.println( alfa.accelerate());
        System.out.println( alfa.brake());

        Dacia dacia=new Dacia("Logan",8);
        System.out.println(dacia.startEngine());
        System.out.println( dacia.accelerate());
        System.out.println( dacia.brake());
    }


}
