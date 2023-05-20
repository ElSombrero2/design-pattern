package com.elsombrero.factory;

import com.elsombrero.factory.abstracts.AbstractShapeFactory;
import com.elsombrero.factory.shapes.Circle;
import com.elsombrero.factory.shapes.Rectangle;
import com.elsombrero.factory.shapes.Square;

public class ShapeFactory extends AbstractShapeFactory {

    @Override
    public Shape create(ShapeType shape) {
        switch (shape){
            case CIRCLE: return new Circle();
            case RECTANGLE: return new Rectangle();
            case SQUARE: return new Square();
        }
        return null;
    }

}
