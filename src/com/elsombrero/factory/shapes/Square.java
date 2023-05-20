package com.elsombrero.factory.shapes;

import com.elsombrero.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() { System.out.println("Square::draw()"); }
}
