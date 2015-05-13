package com.example.mario;

import com.example.mario.type.console;
import com.example.mario.type.file;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by garrettcoggon on 5/11/15.
 */
// Map string options to types for implementation
public class Pyramid implements CleanString {
    public static Printer createPyramid(String type) {
        // Mapping types to strings
        Map<String, Printer> TypeMap = new HashMap<>();
        TypeMap.put("console", new console());
        TypeMap.put("file", new file());
        //final Type ftype = TypeMap.get(type);
        return TypeMap.get(type);
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
