package com.example.mario.type;

import com.example.mario.Build;
import com.example.mario.Printer;

/**
 * Created by garrettcoggon on 5/6/15.
 */
public class console implements Printer {

    @Override
    public void Builder(int height) {
        new Build(height);
    }
}
