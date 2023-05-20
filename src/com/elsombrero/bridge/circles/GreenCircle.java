package com.elsombrero.bridge.circles;

import com.elsombrero.bridge.DrawAPI;

public class GreenCircle implements DrawAPI {
    @Override
    public void draw(float radius, int x, int y) {
        System.out.println(String.format("Circle{Color: Green, Radius: %f, X: %d, Y: %d}", radius, x, y));
    }
}
