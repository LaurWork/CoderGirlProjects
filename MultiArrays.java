package com.jetbrains;
import static java.lang.System.out;
public class Main {


    public static void main(String[] args) {

        System.out.println("Temperature Calculator");
        System.out.println(" ");
        System.out.println("The data provided are:");

        //set up and print days array, time array, temps array

        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        String[] times = {"7:00 AM", "3:00 PM", "7:00 PM", "3:00 AM"};


        int[][] grid = {
                {68, 70, 76, 70, 68, 71, 75},
                {76, 76, 87, 84, 82, 75, 83},
                {73, 72, 81, 78, 76, 73, 77},
                {64, 65, 69, 68, 70, 74, 72}};


        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 7; column++) {
                System.out.println(row + "," + column + " : " + grid[row][column]);
            }

            System.out.println(" ");
        }

        System.out.println("Based on that data, the following are the average temperatures for the week.");
        System.out.println(" ");

//        set up method to calculate averages
//
//        public static int addition();
//        {
//
//            int sum = 0;
//            for (int row = 0; row < grid.length; row++)
//                for (int column = 0; column < grid.length; column++)
//                    sum += grid[row][column];
//
//            System.out.println(sum);
//        }

        int sum = 0;
        for (int row = 0; row < 4; row++)
            for (int column = 0; column < 7; column++)
                sum += grid[row][column];

            //saturday is sum - column < 6 or 2073 minus 1766 = 307/4 = 76.75
        //friday is sum - column < 5 0r 1766-1473 = 293/4 = 73.25
//
//
        System.out.println("The average final temperature for the week was: ");
        System.out.println(" ");
        System.out.println("Overall: " + (sum/28));




    }
}


/

