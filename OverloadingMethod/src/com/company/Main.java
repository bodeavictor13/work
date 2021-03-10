package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore= calculateScore("Tim", 500);
        System.out.println("New score is"+ newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+ "scored "+score+"points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+score+" points");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("No player, no player points");
        return 0;
    }

    //CHALLENGE
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0 || inches<0 || inches>=13) return -1;
        else{
            // 1 inch=2.54 cm and 1 foot=12 inches
            double cm=(feet*12*2.54);
            cm=cm+ inches*2.54;
            System.out.println(feet+" feet and "+inches+" inches="+
                    cm+" cm");
            return  cm;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0) return -1;
        // 1 inch=2.54 cm and 1 foot=12 inches
        double feet=(int)inches/12;
        double remainingInches=(int) inches%12;
        System.out.println(inches+" inches is equal to "+feet+" feet and "+remainingInches);
        return calcFeetAndInchesToCentimeters(feet,remainingInches);

    }
}
