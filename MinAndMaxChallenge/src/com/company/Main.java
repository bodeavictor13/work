package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        int min=0, max=0;
//        System.out.println("Enter number:");
//        boolean isAnInt=scanner.hasNextInt();
//        if(isAnInt==true){
//            min= scanner.nextInt();max=min;
//            while(isAnInt==true){
//                System.out.println("Enter number:");
//                isAnInt=scanner.hasNextInt();
//                if(isAnInt==true){
//                    int number=scanner.nextInt();
//                    if(number<min) min=number;
//                    if(number>max) max=number;
//                }
//            }
//            System.out.println("Min="+min+" and Max="+max);
//        }
//        else{
//            System.out.println("Not a single correct number input typed");
//        }
//        scanner.close();

        //VARIANTA LUI TIM
        Scanner scanner= new Scanner(System.in);
        int min=0, max=0;
        boolean first=true;

        while (true){
            System.out.println("Enter number:");
            boolean isAnInt=scanner.hasNextInt();
            if(isAnInt==true){
                int number=scanner.nextInt();
                if(first==true){
                    first=false;
                    min=number;
                    max=number;
                }
                if(number>max) max=number;
                if(number<min) min=number;
            }else{
                break;
            }
            scanner.nextLine();//handle input
        }
        System.out.println("min="+min+" , max="+max);
        scanner.close();
    }
}
