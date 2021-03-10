package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner= new Scanner(System.in);
    private static MobilePhone phone= new MobilePhone();

    public static void main(String[] args) {
        printInstructions();
        boolean quit=false;
        int choice=0;
        while(quit==false) {
            System.out.println("Choose what you want to do:");
            choice= scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6: quit=true;
                    break;
                case 1:
                    phone.print();
                    break;

            }
        }
    }

    private static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t0 to print choice options ");
        System.out.println("\t1 to print the entire contact list");
        System.out.println("\t2 to add a contact to the list");
        System.out.println("\t3 to modify a contact from the list");
        System.out.println("\t4 to remove a contact from the list");
        System.out.println("\t5 to search for a contact in the list");
        System.out.println("\t6 to quit the application");
    }
    public static void addContact(){
        Contacts newContact= new Contacts();
        System.out.println("Enter name:");
        newContact.setName(scanner.nextLine());
        System.out.println("Enter number:");
        int number= scanner.nextInt();
        scanner.nextLine();
        newContact.setNumber(number);
        phone.addContact(newContact);
    }

    public static void modifyContact(){
        System.out.println("Enter the name of the contact you want to change:");
        String oldName= scanner.nextLine();
        System.out.println("Enter the new name of the contact:");
        String newName= scanner.nextLine();
        System.out.println("Enter new phone number:");
        int newNumber= scanner.nextInt();
        scanner.nextLine();
        phone.modifyContact(oldName,newName,newNumber);
    }

    public static void removeContact(){
        System.out.println("Enter name of contact you want to delete:");
        phone.removeContact(scanner.nextLine());
    }

    public static void searchContact(){
        System.out.println("Enter name of contact:");
        String name= scanner.nextLine();
        phone.searchContact(name);
    }
}
