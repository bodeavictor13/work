package com.company;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int shets;
    private int quilt;

    public void make(){
        System.out.println("Bed->Making");
    }
    public Bed(String style, int pillows, int height, int shets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.shets = shets;
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getShets() {
        return shets;
    }

    public int getQuilt() {
        return quilt;
    }
}
