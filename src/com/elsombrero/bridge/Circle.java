package com.elsombrero.bridge;

public class Circle extends Shape{

    private float radius;
    private int x, y;

    public Circle(float radius, int x, int y, DrawAPI api){
        super(api);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        this.api.draw(radius, x, y);
    }

}
