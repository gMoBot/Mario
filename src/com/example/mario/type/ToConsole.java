package com.example.mario.type;

import com.example.mario.Build;
import com.example.mario.Printer;
import com.example.mario.Pyramid;

/**
 * Created by garrettcoggon on 5/6/15.
 */
public class ToConsole implements Printer {

    @Override
    public void Builder() {
        new Pyramid();
    }
}
