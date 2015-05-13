package com.example.mario;

import com.example.mario.type.console;
import com.example.mario.type.file;
import java.io.Console;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.example.mario.Pyramid.createPyramid;


/**
 * Created on 5/4/15.
 * "Mario" from CS50 in java form
 */
public class Mario {

    public static void main(String[] args){

        // Solicit and validate user input for height of pyramid and output type
        Scanner input = new Scanner(System.in);
        Console c = System.console();

        // Solicit and validate user input for pyramid height
        int height;
        do {
            System.out.print("Enter a positive int less than 23: ");
            height = input.nextInt();
        } while (height < 0 || height > 23);

        // Solicit user input for output type
        String type;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            stringBuilder.setLength(0);
            System.out.print("Please enter preferred output type: console or file: ");
            stringBuilder.append(input.next());
            type = stringBuilder.toString();
        } while (!"file".equalsIgnoreCase(type) && !"console".equalsIgnoreCase(type));
        // pset3
        Type pyramid = createPyramid(type);
        if (pyramid != null) {
            pyramid.Builder(height);
        }
    }
}
