package com.example.mario;

import com.example.mario.type.ToConsole;
import com.example.mario.type.ToFile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by garrettcoggon on 5/11/15.
 */
// Map string options to types for implementation
public class Pyramid implements CleanString {
//    public static Printer createPyramid(String type) {
//        // Mapping types to strings
//        Map<String, Printer> TypeMap = new HashMap<>();
//        TypeMap.put("console", new ToConsole());
//        TypeMap.put("file", new ToFile());
//        //final Type ftype = TypeMap.get(type);
//        return TypeMap.get(type);
//    }
    public Pyramid(){
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
        String cleanString = null;
        if (type.equalsIgnoreCase("console")) {
            cleanString = "console";
        }else if (type.equalsIgnoreCase("file")) {
            cleanString = "file";
        }
        return cleanString;
    }
}
