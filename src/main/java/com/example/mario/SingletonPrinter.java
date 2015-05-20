package com.example.mario;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;


/**
 * Created by garrettcoggon on 5/15/15.
 */
//Employs the Singleton Pattern to set system output and call pyramid creation
public class SingletonPrinter {

    private SingletonPrinter(){}

    private static SingletonPrinter singletonPrinter;

    public static SingletonPrinter getInstance() {
        if (singletonPrinter == null) {
            singletonPrinter = new SingletonPrinter();
        }
        return singletonPrinter;
    }
    public Pyramid PrintToConsole(){
        return new Pyramid();
    }

    // Set system out to print to file, error checks file opening
    public void PrintToFile(){
        File mario = new File("mario.txt");
        // Opens new file, checks for exceptions
        try (FileOutputStream fos = new FileOutputStream(mario); PrintStream output =new PrintStream(fos); ) {
            System.setOut(output);
            new Pyramid();
            // Logs errors with opening the file
        } catch (Exception e) {
            System.out.println("There was a problem finding the file" + e.getMessage());
            throw new RuntimeException();
        }
    }

}

