package com.example.mario;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by garrettcoggon on 5/4/15.
 * "Mario" from CS50 in java form
 */
public class Mario {

public static void main(String[] args) {
        // Solicit and validate user input for height of pyramid
        Scanner input = new Scanner( System.in );
        Console c = System.console();
        int h;
        do {
            System.out.print("Enter a positive int less than 23: ");
            h = input.nextInt();
        } while (h < 0 || h > 23);

        // Generate pyramid structure based on user input
        int x = (h - 2);
        for (int i = h; i > 0; i--){
            for (int j = 0; j < (i - 1); j++){
                System.out.printf(" ");
            }
            for (int k = 0; k < (i - x ); k++){
                System.out.printf("#");
            }
            System.out.printf("\n");
            x = x - 2;
        }
    }
}
