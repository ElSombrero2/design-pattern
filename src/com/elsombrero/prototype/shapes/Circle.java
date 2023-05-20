package com.elsombrero.prototype.shapes;

import com.elsombrero.prototype.Shape;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }

}
