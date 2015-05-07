package com.example.mario.type;

import com.example.mario.Build;
import com.example.mario.Type;

/**
 * Created by garrettcoggon on 5/6/15.
 */
public class console implements Type {

    @Override
    public void Builder(int height) {
        new Build(height);
    }
}
