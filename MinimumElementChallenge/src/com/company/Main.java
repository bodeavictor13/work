package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("How many integers you need?");
        int[] array=readIntegers(scanner.nextInt());
        System.out.println(findMin(array));
    }
    private static int[] readIntegers(int count){
        int[] array= new int[count];
        for (int i=0; i<count; i++){
            array[i]= scanner.nextInt();
        }
        return array;
    }
    public static int findMin(int[] array){
         int min= array[0];
         for (int i=1; i< array.length;i++){
             if (array[i]<min) min=array[i];
         }
         return min;
    }
}
