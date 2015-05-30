package com.example.mario;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;


/**
 * Created by garrettcoggon on 5/15/15.
 */
//set system output and call pyramid creation
public class Printer {

    private Printer(){}

    private static Printer printer;

    public static Printer getInstance() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }
    public pyramid printToConsole(){
        return new pyramid();
    }

    // Set system out to print to file, error checks file opening
    public void printToFile(){
        File mario = new File("mario.txt");
        // Opens new file, checks for exceptions
        try (FileOutputStream fos = new FileOutputStream(mario); PrintStream output =new PrintStream(fos); ) {
            System.setOut(output);
            new pyramid();
            // Logs errors with opening the file
        } catch (Exception e) {
            System.out.println("There was a problem finding the file" + e.getMessage());
            throw new RuntimeException();
        }
    }

}

