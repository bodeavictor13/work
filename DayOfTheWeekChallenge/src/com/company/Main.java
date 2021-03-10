package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(1);
        printDayOfTheWeek2(1);
    }

    public static void printDayOfTheWeek(int day){
         switch(day){
             case 0:
                 System.out.println("Sunday");
                 break;
             case 1:
                 System.out.println("Monday");
                 break;
             case 2:
                 System.out.println("Tuesday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             default:
                 System.out.println("Invalid day");
                 break;
         }
    }

    public static void printDayOfTheWeek2(int day){
        if(day==0) System.out.println("Sunday");
        else if(day==1) System.out.println("Monday");
        else if(day==2) System.out.println("Tuesday");
        else if(day==3) System.out.println("Wednesday");
        else if(day==4) System.out.println("Thursday");
        else if(day==5) System.out.println("Friday");
        else if(day==6) System.out.println("Saturday");
        else System.out.println("Invalid day");
    }

    public static boolean isLeapYear(int year){
        if(year<1 || year>9999) return false;
        if((year%4==0 && year%100!=0) || year%400==0) return true;
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if(month<1 || month>12) return -1;
        if(year<1 || year>9999) return -1;
        switch(month){
            case 1: return 31;
            case 2: if(isLeapYear(year)==false) return 28;
            else return 29;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31; 
        }
        return -1;
    }
}
