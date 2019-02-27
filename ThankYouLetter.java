package com.jetbrains;
import static java.lang.System.out;
import java.util.Scanner;


public class ThankYouLetter {

    public static void main(String[] args) {

        out.println("--- Thank You Letters ---");

        boolean keepGoing = true;

        while (keepGoing = true)
        {

            out.println("Name");
            Scanner keyboard = new Scanner(System.in);
            String name = keyboard.nextLine();

            if (name.equals("quit")) break;

            out.println("Amount");
            float donation = keyboard.nextFloat();

            out.println("Dear " + name + ",");
            out.println("Thank you for your donation!  We rely on donors like you to keep our");
            out.println("organization effective, and you came through for us.  Your donation of $" + donation);
            out.println("will help our efforts to make a difference in the world.");
            out.print("");

            out.println("As you may know, we are a registered non-profit organization, so your");
            out.println("donation is tax deductible.  You may use this letter as a receipt for tax");
            out.println("purposes.");
            out.print("");

            out.println("Thank you again for your support!");
            out.print("");

            out.println("Sincerely,");
            out.println("Paula Jones");

            }

        }
    }

