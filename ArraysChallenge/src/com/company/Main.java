package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int[] myintegers= getIntegers(5);
        int[] sorted= sortIntegers(myintegers);
        printArray(sorted);
    }
    public static int[] getIntegers(int capacity){
        int[] array=new int[capacity];
        System.out.println("Enter "+capacity+" integers:");
        for(int i=0; i< capacity;i++){
            array[i]= scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i=0; i< array.length;i++){
            System.out.println("element "+i+" is:" +array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        Arrays.sort(array);
        int[] sortedDescending= new int[array.length];
        for (int i=0; i< array.length;i++){
            sortedDescending[i]=array[array.length-1-i];
        }
         return sortedDescending;
    }

}
