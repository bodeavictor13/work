package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer=new Printer(50, false);
        System.out.println("Initial page count= "+printer.getPrintedPages());
        int pagesPrinted=printer.printPages(4);
        System.out.println("pages printed was "+pagesPrinted+" new total print count for printer= "+printer.getPrintedPages());
        pagesPrinted=printer.printPages(2);
        System.out.println("pages printed was "+pagesPrinted+" new total print count for printer= "+printer.getPrintedPages());

    }
}
