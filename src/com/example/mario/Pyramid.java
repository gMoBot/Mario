// package com.example.mario;

import java.io.*;

/**
 * Created by garrettcoggon on 5/4/15.
 * Directs system output
 */
// public class Pyramid {

//    //Directs system output
//    private int height;
//    //private String type;
//    private Type selection;
//
//    public void Pyramid(int height, Type selection){
//        this.height = height;
//        this.selection = selection;
//    }
//
//    public void useType(int height, Type selection){
//        selection.Builder(height);
//    }
//    public int getHeight(){
//        return height;
//    }

//    public Type getType(){
//        return type;
//    }

//    public void Builder(int height){
//        type.Builder(height);
//    }

    // PREVIOUS CODE:
//    public Pyramid(int height, String type) {
//        if (type.equalsIgnoreCase("console")) {
//            new Build(height);
//            // Changes system output to mario file
//        } else if (type.equalsIgnoreCase("file")) {
//            File mario = new File("mario.txt");
//            PrintStream output = null;
//            // Opens new file, checks for exceptions
//            try {
//                FileOutputStream fos = new FileOutputStream(mario);
//                output =new PrintStream(fos);
//                System.setOut(output);
//                new Build(height);
//            // Logs errors with opening the file
//            } catch (FileNotFoundException e) {
//                System.out.println("There was a problem finding the file" + e.getMessage());
//                throw new RuntimeException();
//            } finally {
//                output.close();
//            }
//        }
//    }
//}
