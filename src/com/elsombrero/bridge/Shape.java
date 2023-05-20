package com.elsombrero.bridge;

public abstract class Shape {

    protected DrawAPI api;

    Shape(DrawAPI api){
        this.api = api;
    }

    public abstract void draw();

}
