package com.elsombrero.factory.shapes;

import com.elsombrero.factory.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() { System.out.println("RoundedRectangle::draw()"); }
}
