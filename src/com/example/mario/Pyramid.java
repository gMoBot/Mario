package com.example.mario;

import com.example.mario.type.console;
import com.example.mario.type.file;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by garrettcoggon on 5/11/15.
 */
public class Pyramid {
    public static Type createPyramid(String type) {
        // Mapping types to strings
        Map<String, Type> TypeMap = new HashMap<>();
        TypeMap.put("console", new console());
        TypeMap.put("file", new file());
        //final Type ftype = TypeMap.get(type);
        return TypeMap.get(type);
    }
}
