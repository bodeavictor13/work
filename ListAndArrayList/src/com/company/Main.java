package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    private static GroceryList groceryList= new GroceryList();

    public static void main(String[] args) {
        boolean quit=false;
        int choice =0;
        printInstructions();
        while(quit==false){
            System.out.println("Enter your choice:");
            choice= scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0: printInstructions();
                        break;
                case 1: groceryList.printGroceryList();
                        break;
                case 2: addItem();
                        break;
                case 3: modifyItem();
                        break;
                case 4: removeItem();
                        break;
                case 5: searchForItem();
                        break;
                case 6: processArrayList();
                        break;
                case 7: quit=true;
                        break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t0 to print choice options ");
        System.out.println("\t1 to print the entire grocery list");
        System.out.println("\t2 to add an item to the list");
        System.out.println("\t3 to modify an item from the list");
        System.out.println("\t4 to remove an item from the list");
        System.out.println("\t5 to search for an item in the list");
        System.out.println("\t6 to quit the application");

    }

    public static void addItem(){
        System.out.print("PLease enter a grocery item:");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Current item name:");
        String itemNumber=scanner.nextLine();
        System.out.println("Enter replacement item:");
        String newItem=scanner.nextLine();
        groceryList.modifyItem(itemNumber, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item name to be removed:");
        String item=scanner.nextLine();
        groceryList.removeItem(item);
    }

    public static void searchForItem(){
        System.out.println("Enter item name to be searched:");
        if(groceryList.onFile(scanner.nextLine())==false) System.out.println("Item not found");
        else System.out.println("Found in the grocery list");
    }

    public static void processArrayList(){
        ArrayList<String> newArray= new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList()); //copy the entire list to the new list

        //SAU
        ArrayList<String> nextArray= new ArrayList<String>(groceryList.getGroceryList());
        String[] myArray= new String[groceryList.getGroceryList().size()];
        myArray=groceryList.getGroceryList().toArray(myArray);
    }
}
