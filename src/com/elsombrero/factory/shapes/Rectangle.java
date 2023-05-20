package com.elsombrero.factory.shapes;

import com.elsombrero.factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() { System.out.println("Rectangle::draw()"); }
}
