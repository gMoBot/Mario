package com.example.mario.type;

import com.example.mario.Build;
import com.example.mario.Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by garrettcoggon on 5/6/15.
 */
public class file implements Type{

    @Override
    public void Builder(int height) {
        File mario = new File("mario.txt");
        PrintStream output = null;
        // Opens new file, checks for exceptions
        try {
            FileOutputStream fos = new FileOutputStream(mario);
            output =new PrintStream(fos);
            System.setOut(output);
            new Build(height);
            // Logs errors with opening the file
        } catch (FileNotFoundException e) {
            System.out.println("There was a problem finding the file" + e.getMessage());
            throw new RuntimeException();
        } finally {
            output.close();
        }
    }
}
