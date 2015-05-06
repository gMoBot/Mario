package com.example.mario;

import java.io.Console;
import java.util.Scanner;

/**
 * Created on 5/4/15.
 * "Mario" from CS50 in java form
 */
public class Mario {

public static void main(String[] args) {
    // Solicit and validate user input for height of pyramid and output type
    Scanner input = new Scanner(System.in);
    Console c = System.console();
    // Solicit user input for output type
    String type;
    StringBuilder stringBuilder = new StringBuilder();
    while (true) {
        System.out.print("Please enter preferred output type: console or file: ");
        stringBuilder.append(input.next());
        type = stringBuilder.toString();
        if (type.equalsIgnoreCase("console")) {
            break;
        } else if (type.equalsIgnoreCase("file")) {
            break;
        } else
            continue;
    }

    // Solicit and validate user input for pyramid height
    int height;
    do {
        System.out.print("Enter a positive int less than 23: ");
        height = input.nextInt();
    } while (height < 0 || height > 23);

    // Generate pyramid structure based on user input
    new Pyramid(height, type);
}
}
