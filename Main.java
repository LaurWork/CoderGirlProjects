package com.jetbrains;
import static java.lang.System.out;
import java.util.Scanner;

public class Main {

    private static Object String;

    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

     out.print("Please list three items on your grocery shopping list.");

        String= keyboard.nextLine();
             String ItemOne = keyboard.next();
             String ItemTwo = keyboard.next();
             String ItemThree = keyboard.next();

        out.println("Now, please enter the quantity of each item.");
        out.println("How many " + ItemOne + "?");
            int ItemOneAmt = keyboard.nextInt();
        out.println("How many " + ItemTwo + "?");
            int ItemTwoAmt = keyboard.nextInt();
        out.println("How many " + ItemThree + "?");
            int ItemThreeAmt = keyboard.nextInt();

         out.println("Now, please enter the price of each item.");
         out.println("How much does one " + ItemOne + " cost?");
            float ItemOneCost = keyboard.nextFloat();
         out.println("How much does one " + ItemTwo + " cost?");
            float ItemTwoCost = keyboard.nextFloat();
         out.println("How much does one " + ItemThree + " cost?");
            float ItemThreeCost = keyboard.nextFloat();

        out.println("Calculating your grocery bill.");
            float total = (ItemOneAmt * ItemOneCost) + (ItemTwoAmt * ItemTwoCost) + (ItemThreeAmt * ItemThreeCost);
            out.println("Your total cost is $" + total + ".");
    }
}
