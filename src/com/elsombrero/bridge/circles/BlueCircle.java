package com.elsombrero.bridge.circles;

import com.elsombrero.bridge.DrawAPI;

public class BlueCircle implements DrawAPI {
    @Override
    public void draw(float radius, int x, int y) {
        System.out.println(String.format("Circle{Color: Blue, Radius: %f, X: %d, Y: %d}", radius, x, y));
    }
}
