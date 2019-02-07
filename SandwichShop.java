package com.jetbrains;
import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{

    public static void main
            (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        int VeggiesSold = keyboard.nextInt();

            if (VeggiesSold >= 50)
            {
                out.println("Made goal for veggies.");
            }
            else
            {
                out.println("Fell short of goal for veggies.");
            }

        out.println("The sales goal for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today?");
        int BurgersSold = keyboard.nextInt();

            if (BurgersSold >= 250)
            {
                out.println("Made goal for burgers.");
            }
            else
            {
                out.println("Fell short of goal for burgers.");
            }

        out.println("The sales goal for subs is " + goalForSubs);
        out.println("How many subs were sold today?");
        int SubsSold = keyboard.nextInt();

            if (SubsSold >= 180)
            {
                out.println("Made goal for subs.");
            }
            else
                {
                out.println("Fell short of goal for subs.");
            }

        out.println("The sales goal for soup is " + goalForSoup);
        out.println("How many soups were sold today?");
        int SoupsSold = keyboard.nextInt();

            if (SoupsSold >= 70)
            {
                out.println("Made goal for soup.");
            }
            else
            {
                out.println("Fell short of goal for soup.");
            }

            if (VeggiesSold >= 50 && BurgersSold >=250 && SubsSold >= 180 && SoupsSold >= 70)
            {
                out.println("Made goal for everything!");
            }
    }
}
