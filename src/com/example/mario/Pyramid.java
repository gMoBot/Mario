package com.example.mario;

import java.io.*;

/**
 * Created by garrettcoggon on 5/4/15.
 */
public class Pyramid {
    public Pyramid(int height, String out) {
        if (out.equalsIgnoreCase("console")) {
            //TODO
            new Build(height);
        } else if (out.equalsIgnoreCase("file")) {
            //TODO: Try-catch file opening
            // CLOSE FILE
            File mario = new File("mario.txt");
            PrintStream output = null;

            try {
                FileOutputStream fos = new FileOutputStream(mario);
                output =new PrintStream(fos);
                System.setOut(output);
                new Build(height);
            } catch (FileNotFoundException e) {
                System.out.println("There was a problem finding the file" + e.getMessage());
                throw new RuntimeException();
            } finally {
                output.close();
            }
            //FileOutputStream fos = new FileOutputStream(mario);
            //PrintStream ps = new PrintStream(fos);
            //System.setOut(ps);
            //Call Pyramid Function
            new Build(height);
        }
    }
}
