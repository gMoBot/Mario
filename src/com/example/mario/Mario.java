package com.example.mario;

import com.example.mario.type.console;
import com.example.mario.type.file;
// import com.example.mario.Pyramid;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;

/**
 * Created on 5/4/15.
 * "Mario" from CS50 in java form
 */
public class Mario {

public static void main(String[] args) {

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
        //stringBuilder.setLength(0);
        System.out.print("Please enter preferred output type: console or file: ");
        stringBuilder.append(input.next());
        type = stringBuilder.toString();
//        if (type.equalsIgnoreCase("console")) {
//            // Generate pyramid structure based on output type and height
//            Pyramid pyramid = new Pyramid(height, new console(height));
//            break;
//        } else if (type.equalsIgnoreCase("file")) {
//            // Generate pyramid structure based on output type and height
//            Pyramid pyramid = new Pyramid(height, new file(height));
//            break;
//        } else
//            continue;
    } while (!type.equalsIgnoreCase("console") || !type.equalsIgnoreCase("file"));
    // Try Mapping names and strings
    Map<String,Type> TypeMap = new HashMap<>();
    TypeMap.put("console", new console());
    TypeMap.put("file", new file());
    final Type ftype = TypeMap.get(type);
    if (ftype != null){
        ftype.Builder(height);
    }
            //Type = TypeMap.get(type);
    // Generate pyramid
//    Pyramid pyramid = new Pyramid(height, selection;
//    pyramid.useType(height, type);
//    Type selection = type;


//    // Generate pyramid structure based on output type and height
//    Pyramid pyramid = new Pyramid(height, new console());

    // Generate pyramid structure based on user input
    //new Pyramid(height, type);
}
}
