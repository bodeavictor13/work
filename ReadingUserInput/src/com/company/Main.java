package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter you year of birth:");
//
//        boolean hasNextInt=scanner.hasNextInt();// verifies if the characters typed are numbers and form a whole number
//
//        if(hasNextInt==true){
//            int yearOfBirth= scanner.nextInt();
//            scanner.nextLine(); //handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name=scanner.nextLine();
//            int age= 2020- yearOfBirth;
//            if(age>=0 && age<=100) {
//                System.out.println("Your name is "+name+", and you are "+age+" years old");
//            } else {
//                System.out.println("Invalid year of birth");
//            }
//        } else{
//            System.out.println("Unable to parse year of birth.");
//        }
//        scanner.close();


        // CHALLENGE

        Scanner scanner = new Scanner(System.in);
        int sum=0;
        for(int i=0; i<10;i++){
            System.out.println("Enter number #"+(i+1)+":");
            boolean hasNextInt=scanner.hasNextInt();
            if(hasNextInt==true){
                sum=sum+scanner.nextInt();
            }
            else{
                System.out.println("Invalid Number");
                i--;
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();

        //VARIANTA 2  A LUI TIM
//        Scanner scanner = new Scanner(System.in);
//        int counter=0;
//        int sum=0;
//        while(counter<10){
//            int order=counter+1;
//            System.out.println("Enter number #"+order+":");
//
//            boolean isAnInt=scanner.hasNextInt();
//            if(isAnInt==true){
//                int number=scanner.nextInt();
//                counter++;
//                sum += number;
//            }else{
//                System.out.println("Invalid Number");
//            }
//            scanner.nextLine();//handle enter key
//        }
//        System.out.println("Sum="+sum);
//        scanner.close();
    }



}
