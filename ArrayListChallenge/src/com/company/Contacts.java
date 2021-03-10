package com.company;

public class Contacts {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Contacts(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Contacts() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
