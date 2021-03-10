package com.company;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean duplex;

    public int fillTonerUp(int tonerAmount){
        if (tonerAmount>0 && tonerAmount<=100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel = this.tonerLevel + tonerAmount;
            return this.tonerLevel;
        }
        else return -1;
    }

    public int printPages(int pages){
        int pagesToPrint=pages;
        if (this.duplex==true) {
            pagesToPrint = (pages/ 2)+(pages%2);
            System.out.println("Printing in duplex mode");
        }
        this.printedPages=this.printedPages+pagesToPrint;
        return pagesToPrint;
    }

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel>-1 && tonerLevel<=100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel=-1;
        this.duplex = duplex;
        this.printedPages=0;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
