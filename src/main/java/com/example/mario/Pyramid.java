package com.example.mario;

/**
 * Created by garrettcoggon on 5/11/15.
 */
// Overrides toString and implements the creation of the pyramid
public class pyramid implements CleanString {

    // Core logic for creating the pyramid
    public pyramid(){
        int x = (Mario.height - 2);
        for (int i = Mario.height; i > 0; i--) {
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

    // pset3 Overrride toString method to ensure chosen method is formatted exactly as expected
    @Override
    public java.lang.String toString(String type) {
        if (type.equalsIgnoreCase("console")) {
            return "console";
        }else if (type.equalsIgnoreCase("file")) {
             return "file";
        }
        return type;
    }
}
