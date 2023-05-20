package com.elsombrero.prototype.shapes;

import com.elsombrero.prototype.Shape;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }

}
