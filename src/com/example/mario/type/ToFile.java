package com.example.mario.type;

import com.example.mario.Build;
import com.example.mario.Printer;
import com.example.mario.Pyramid;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by garrettcoggon on 5/6/15.
 */
public class ToFile implements Printer {

    @Override
    public void Builder() {
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