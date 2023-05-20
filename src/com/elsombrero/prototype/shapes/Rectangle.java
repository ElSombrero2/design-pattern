package com.elsombrero.prototype.shapes;

import com.elsombrero.prototype.Shape;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }

}
