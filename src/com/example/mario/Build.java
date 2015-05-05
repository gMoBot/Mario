package com.example.mario;

/**
 * Created by garrettcoggon on 5/5/15.
 */
public class Build {
    // Generate a new pyramid from user input
    public Build(int height){
        int x = (height - 2);
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < (i - 1); j++) {
                System.out.printf(" ");
            }
            for (int k = 0; k < (i - x); k++) {
                System.out.printf("#");
            }
            System.out.printf("\n");
            x = x - 2;
        }
    }
}
