package com.jetbrains;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Multiplication Tables");

        System.out.println("How large would you like to see them? 1-20");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();

        if(size>20)
        System.out.println("Pick a number between 1 and 20.");


            for (int rows = 0; rows <= size; rows++) {
                for (int columns = 0; columns <= size; columns++) {
                    System.out.println(rows + "*" + columns + "=" + (rows * columns));

                }
                System.out.println();

        }
    }
}
