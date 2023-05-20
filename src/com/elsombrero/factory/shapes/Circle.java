package com.elsombrero.factory.shapes;

import com.elsombrero.factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() { System.out.println("Circle::draw()"); }
}
